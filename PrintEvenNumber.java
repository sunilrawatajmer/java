import java.util.Scanner;
class Main 
{
  public static void main (String b[])
  {
     
      int size,e,o,i;
       int arr[];
      Scanner ob= new Scanner(System.in);
      System.out.print("Enter Elements size ." );
      size=ob.nextInt();
      arr=new int[size];
      System.out.println("enter Elements : ");
      for(i=0;i<arr.length;i++)
      {
          arr[i]=ob.nextInt();
      }
      
      System.out.println("Even numbers -"); 
      for(i=0;i<arr.length;i++)
      {
         if(arr[i]%2==0)
         {
           System.out.println(arr[i]); 
         }
        
      }
  }
}