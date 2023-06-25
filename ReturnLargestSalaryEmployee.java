import java.util.Scanner;

class Employee {
    int code, salary;
    String name;
    Scanner obj = new Scanner(System.in);

    void Set() {

        System.out.print("Enter Employee Code : ");
        code = obj.nextInt();
        System.out.print("Enter Employee Name : ");
        name = obj.next();
        System.out.print("Enter Employee Salary : ");
        salary = obj.nextInt();

    }

    Employee() {
        code = 0;
        name = "";
        salary = 0;
    }

    Employee ReturnLargestSalaryEmployee(Employee[] emp) {
        Employee lar = emp[0];
        lar.salary = 0;
        for (int j = 0; j < emp.length; j++) {
            if (emp[j].salary > lar.salary) {
                lar.salary = emp[j].salary;
            }
        }

        return lar;
    }

    void show() {
        System.out.println("Code = " + code + "  Name = " + name + "  Salary = " + salary);
    }

}

public class ReturnLargestSalaryEmployee {
    public static void main(String[] args) {
        Employee ob[] = new Employee[2];
        Employee ob2 = new Employee();

        for (int i = 0; i < 2; i++) {
            ob[i] = new Employee();
            ob[i].Set();
        }

        for (int i = 0; i < 2; i++) {
            ob[i].show();
        }

        ob2 = ob2.ReturnLargestSalaryEmployee(ob);
        System.out.println(" Which Salary is Largest That Employee is : ");
        ob2.show();

    }

}
