import java.util.Scanner;
class Employee{
    int code,salary;
    String name;
     Scanner obj = new Scanner (System.in);
    void Set(){
        
        System.out.print("Enter Employee Code : ");
        code=obj.nextInt();
        System.out.print("Enter Employee Name : ");
        name=obj.next();
         System.out.print("Enter Employee Salary : ");
        salary=obj.nextInt();
        
    }
    
    void show(){
        System.out.println("Code = "+code+"  Name = "+name+"  Salary = "+salary);
    }
    
    
}

public class ArrayObject
{
	public static void main(String[] args) {
	    Employee ob[] = new Employee[5];
	    for(int i=0; i<1; i++){
	        ob[i]=new Employee();
	        ob[i].Set();
	    }
	    
	    for(int i=0; i<5; i++){
	        ob[i].show();
	    }
	}
}
