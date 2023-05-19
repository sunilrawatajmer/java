import java.util.Scanner;
class Example
{
    public static void main(String arr[]) 
    {
        int i,size;
        Scanner ob=new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        size = ob.nextInt();

        String st[] = new String[5];
        String search;

        System.out.println("Enter Elements : ");
        for(i=0;i<size;i++)
        {
            st[i]=ob.next();
        }

        System.out.println("You Entered Elements : ");
        for(i=0;i<size;i++)
        {
            System.out.println(st[i]);
        }

         System.out.print("Enter Search String :");
         search = ob.next();

         for(i=0;i<size;i++){
            if(st[i].equals(search)){
                System.out.print("String is Finded.");
            }
            else{
                System.out.print("String is not Finded.");
                break;
            }
        }
         
    }
}