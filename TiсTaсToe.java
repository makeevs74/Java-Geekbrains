import java.util.Random;
import java.util.Scanner;

public class TiсTaсToe {
    final char SIGN_X = 'X';
    final char SIGN_O = 'O';
    final char SIGN_EMPTY = '*';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TiсTaсToe().game();
    }

    TiсTaсToe() {
        table = new char[5][5];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, draw!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, draw!");
                break;
            }
        }
        System.out.println("Game Over");
        printTable();
    }

    void initTable() {
        for (int i = 0; i < 5; i++) {
            for (int j =0; j < 5; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < 5; i++) {
            for (int j =0; j < 5; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Your turn x y [1..5]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_X;
    } 

     void turnAI() {
        int x, y;
        do {
            x = random.nextInt(5);
            y = random.nextInt(5);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }

    public boolean checkWin(char ch) {
        for (int i = 0; i < 5; i++) {
            if ((table[0][i] == ch && table[1][i] == ch && table[2][i] == ch && table[3][i] == ch && table[4][i] == ch) || 
            (table[i][0] == ch && table[i][1] == ch && table[i][2] == ch)) {
                return true;
            }
        }
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch && table[3][3] == ch && table[4][4] == ch) return true;
        if (table[4][0] == ch && table[3][1] == ch && table[2][2] == ch && table[1][3] == ch && table[0][4] == ch) return true;
        return false;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 4 || y > 4) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean isTableFull() {
        for (int i = 0; i < 5; i++) {
            for (int j =0; j < 5; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
