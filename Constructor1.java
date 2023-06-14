public class Constructor1 {
    public static void main(String[] args) {
        Teacher ob1 = new Teacher();
        ob1.showData();//Default Constructor Called

        Teacher ob2 = new Teacher("Rawat","1237890",10000);
        ob2.showData();//Parameter Constructor Called
    }
}

class Teacher{
    String teacherName;
    String mobileNo;
    int salary;

    Teacher(){
        teacherName="Sunil";
        mobileNo="1234567890";
        salary=12000;
    }

    Teacher(String a,String b,int c){
        teacherName=a;
        mobileNo=b;
        salary=c;
    }

    void showData(){
        System.out.println("Teacher Name = "+teacherName);
        System.out.println("Teacher Mobile No = "+mobileNo);
        System.out.println("Teacher Salary = "+salary);
    }
}
