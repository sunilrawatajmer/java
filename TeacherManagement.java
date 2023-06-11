class TeacherManagement{
    public static void main(String arr[]){
        
        Teacher t1 = new Teacher();
        t1.setfirstName("Sunil");
        t1.setlastName("Rawat");
        t1.setgender("Male");
        t1.setsalary(12000);
        t1.setmobileNo("1234568988");
        t1.setid("sunil@gmail.com");
        t1.showData();
        System.out.println(t1.getFullName());

        System.out.println();

        Teacher t2 = new Teacher();
        t2.setData("Renu", "Rawat", 20000, "Female", "9876543211", "Renu@gmail.com");
        t2.showData();
        
    }
}

class Teacher{
    String fullName;
    String firstName;
    String lastName;
    int salary;
     String gender;
     String mobileNo;
     String id;
     
     
     void setData(String a,String b,int c,String d,String e,String f){
         firstName=a;
         lastName=b;
         salary=c;
         gender=d;
         mobileNo=e;
         id=f;
     }
     
     void showData(){
          System.out.println("FullName="+firstName+" "+lastName);
         // System.out.println("firstName="+firstName);
         // System.out.println("lastName="+lastName);
        System.out.println("salary="+salary);
        System.out.println("gender="+gender);
        System.out.println("mobileNo="+mobileNo);
         System.out.println("Email Id="+id);
     }
     
     
     void setfirstName(String a){
         firstName=a;
     }
     
     
      void setlastName(String b){
         lastName=b;
     }
     
     String getFullName(){
         return firstName+lastName;
     }
     
     
     void setsalary(int c){
         salary=c;
     }
     
      int getsalary(){
         return salary;
     }
     
      void setgender(String d){
         gender=d;
     }
     
     String getgender(){
         return gender;
     }
     
      void setmobileNo(String e){
         mobileNo=e;
     }
     
     String getmobileNo(){
         return mobileNo;
     }
     
     void setid(String f){
         id=f;
     }
     
     String getid(){
         return id;
     }
     
     
     
}

