import java.util.Scanner;
class Employee{
    int empCode;
    String empName;
    Employee(int c,String nm){
        empCode=c;
        empName=nm;
    }
    void show(){
        System.out.println(empCode+" - "+empName);
    }
}
public class PassingArgument
{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Employee[] emp = new Employee[5];
            for(int i=0;i<emp.length;i++){
        System.out.print("Enter a code : ");
        int c = ob.nextInt();
        System.out.print("Enter a name : ");
        String nm = ob.next();
                  emp[i] = new Employee(c, nm);
            }
       System.out.println();
                  
        for(int i=0;i<emp.length; i++ )
        {
                    emp[i].show();

        }
}
}