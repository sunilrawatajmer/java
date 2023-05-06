import java.util.Scanner ;
class Demo
{
public static void main(String arr[])
{
int p,r,t;
float result;
Scanner ob = new Scanner(System.in);
System.out.println("enter total paisa : ");
p = ob.nextInt();
System.out.println(" enter persant : ");
r = ob.nextInt();
System.out.println("enter time : ");
t = ob.nextInt();
result=p*r*t/100;
System.out.println("result = "+ result);
}
}