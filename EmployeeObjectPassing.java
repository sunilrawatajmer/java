
//Copy Sencond Objects Elements To First Object
import java.util.Scanner;
public class EmployeeObjectPassing {
   public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);

    System.out.print("Enter Employee Name : ");
    String nm=ob.next();
    System.out.print("Enter Employee Code : ");
    int c=ob.nextInt();
    System.out.print("Enter Employee Salary : ");
    int s=ob.nextInt();

    Employee ob1 = new Employee();
    System.out.println("Ob1 Elements --");
    ob1.show();

     Employee ob2 = new Employee(nm, c, s);
    System.out.println("ob2 Elements --");
    ob2.show();

     System.out.println("Now ob2 Elements Copy to ob1 Object --");
     ob1.copy(ob2);
     ob1.show();
     

   }
}

class Employee{
    String name;
    int code;
    int salary;

    Employee(){
        name="null";
        code=0;
        salary=0;
    }

    Employee(String x,int y,int z){
        name=x;
        code=y;
        salary=z;
    }

    void copy(Employee t){
        this.name=t.name;
        this.code=t.code;
        this.salary=t.salary;
    }

    void show(){
        System.out.println("Employee Name = "+name);
        System.out.println("Employee Code = "+code);
        System.out.println("Employee Salary = "+salary);
    }
}