public class tutionManagement {
    public static void main(String[] args) {
        
        Tution T1 = new Tution();
        T1.setstuName("Suraj");
        T1.setcontactNo("1234567890");
        T1.setage(12);
        T1.setfees(5000);
        T1.setaddress("Ajmer");
        T1.showData();
    }
}

class Tution{
    String stuName;
    String contactNo;
    int age;
    int fees;
    String address;

    void setstuName(String a){
        stuName=a;
    }
    String getstuName(){
        return stuName;
    }

    void setcontactNo(String b){
        contactNo=b;
    }
    String getcontact(){
        return contactNo;
    }

    void setage(int c){
        age = c;
    }
    int getage(){
        return age;
    }

    void setfees(int d){
        fees = d;
    }
    int getfees(){
        return fees;
    }

    void setaddress(String e){
        address=e;
    }
    String getaddress(){
        return address;
    }

    void setData(String a,String b,int c,int d,String e){
        stuName=a;
        contactNo=b;
        age=c;
        fees=d;
        address=e;
    }

    void showData(){
        System.out.println("Name : "+stuName);
        System.out.println("Contact No : "+contactNo);
        System.out.println("Age : "+age);
        System.out.println("Fees : "+fees);
        System.out.println("Adderess : "+address);
    }
}
