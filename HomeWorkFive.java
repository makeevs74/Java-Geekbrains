/**
  * Java. Homework 5
  *
  * @author Makeev Sergey
  * @version 18.11.2021
  */
class HomeWorkFive {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee("Maria Popova", "Secretary", "maria96@mail.ru", "8-999-333-4554", 27000, 25);
        employeeList[1] = new Employee("Artem Fedorov", "Lawyer", "afedorov@mail.ru", "8-922-111-8787", 40000, 27);
        employeeList[2] = new Employee("Stanislav Sergeev", "Manager", "sergeev_stas@mail.ru", "8-912-322-6754", 32000, 23);
        employeeList[3] = new Employee("Aleksander Smirnov", "Senior manager", "SmirnovAA@gmail.ru", "8-999-777-8888", 50000, 37);
        employeeList[4] = new Employee("Igor Davidov", "Head of sales department", "DavidovIV76@mail.ru", "8-919-565-7878", 70000, 45);

        for (int i = 0; i < 5; i++) {
            if (employeeList[i].getAge() > 40) {
                System.out.println(employeeList[i]);
            }    
        }
    }
}

class Employee {
    private String employeename;
    private String position;
    private String email;
    private String phonenumber;
    private int salary;
    private int age;

    Employee(String employeename, String position, String email, String phonenumber, int salary, int age) {
        this.employeename = employeename;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + employeename + "\nPosition: " + position + "\nE-mail: " + email + "\nPhone number: " + phonenumber + "\nSalary: " + salary + "\nAge: " + age + "\n";
    }
}
