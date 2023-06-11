class Student{
    int  stuRollnumber;
    String stuName;
    int stuClass;
    int stuContactNo;

    void setData(int a,String b,int c,int d){
        stuRollnumber=a;
        stuName=b;
        stuClass=c;
        stuContactNo=d;
    }

    void showData(){
        System.out.println("stuRollnumber = "+stuRollnumber);
         System.out.println("stuName = "+stuName);
        System.out.println("stuClass = "+stuClass);
        System.out.println("stuContactNo = "+stuContactNo);

    }

    void setRoll(int a){
        stuRollnumber=a;
    }

    int getRol(){
        return stuRollnumber;
    }

    void stuName(String b){
        stuName=b;
    }
    String getName(){
        return stuName;
    }
    void stuClass(int c){
        stuClass=c;
    }

    int getclas(){
        return stuContactNo;
    }

    void stuContactNo(int d){
        stuContactNo=d;
    }

    int getContactNo(){
        return stuContactNo;
    }


}
 class main {
    public static void Main(String[] args) {
        Student ob = new Student();
        ob.stuRollnumber=101;
        ob.stuName="sunil";
        ob.stuClass=12;
        ob.stuContactNo=123546789;
         ob.showData();
    }
}
