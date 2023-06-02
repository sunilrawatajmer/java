import java.util.ArrayList;
import java.util.Scanner;
class StudentManegementProject {
    public static void main(String a[]){
        int choise;
        ArrayList<Student>allstudent=new ArrayList<Student>();
       
       do{
        Scanner ob = new Scanner(System.in);
        System.out.println();
        System.out.println("Press 0 to Exit ");
        System.out.println("Press 1 to Add Student ");
        System.out.println("Press 2 to Remove Student ");
        System.out.println("Press 3 to View All Students ");
        System.out.println();

        
        System.out.print("Enter Your Choise : ");
        choise=ob.nextInt();

        switch(choise){

            case 1:
            System.out.print("Enter Name : ");
            String name = ob.next();
            System.out.print("Enter Mothername : ");
            String Mothername = ob.next();
            System.out.print("Enter Fathername : ");
            String Fathername = ob.next();
            System.out.print("Enter Classname : ");
            String Classname = ob.next();
            System.out.print("Enter RollNumber : ");
            int rollnumber = ob.nextInt();
            System.out.print("Enter age : ");
            int age = ob.nextInt();
            allstudent.add(new Student(name,Mothername,Fathername,Classname,rollnumber,age));
            break;

            case 2:
            System.out.println("For Remove Student - ");
            System.out.print("Enter Student RollNumber : ");
            int Deleterollnumber = ob.nextInt();
            for(int i=0; i<allstudent.size();i++){
            if(Deleterollnumber == allstudent.get(i).rollnumber)
            {
                allstudent.remove(i);
            }
            }
            break;

            case 3:
            System.out.println("Data of All Students -  ");
            System.out.println("RollNumber \t Name \t MotherName \t FatherName \t ClassName \t Age");
            for(int i=0;i<allstudent.size();i++){
                System.out.println(allstudent.get(i).rollnumber +"\t\t"+ allstudent.get(i).name +"\t\t"+ allstudent.get(i).Mothername +"\t\t"+ allstudent.get(i).Fathername +"\t\t"+ allstudent.get(i).Classname +"\t\t"+allstudent.get(i).age);
            }
            break;

            default:
           // System.out.print("--------Please Select Valid Choise---------");
            break;

        }

       }while(choise!=0);

    }
}

class Student{
    public String name;
    public String Fathername;
    public String Mothername;
    public String Classname;
    public Integer rollnumber;
    public Integer age;
    public Student (String name,String Fathername,String Mothername,String Classname,Integer rollnumber,Integer age){
        this.Fathername=Fathername;
        this.Mothername=Mothername;
        this.name=name;
        this.Classname=Classname;
        this.rollnumber=rollnumber;
        this.age=age;
    }
}
