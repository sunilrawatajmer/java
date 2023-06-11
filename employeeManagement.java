//import javax.sound.sampled.SourceDataLine;
//import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

class Employe
{
    int empCode;
    String empName;
    int empBasicSalary;
    
    void setData(int c,String nm,int s)
    {
        empCode=c;
        empName=nm;
        empBasicSalary=s;
    }
    
    void showData()
    {
        System.out.println("code="+empCode);
        System.out.println("Name="+empName);
        System.out.println("Basicsalary="+empBasicSalary);
    }
    
    void setCode(int c)
    {
        empCode=c;
    }
    
    int getCode()
    {
        return empCode;
    }
    
    void setName (String nm)
    {
        empName=nm;
    }
    
    String getName()
    {
        return empName;
    }
    
    void setBasicSalary(int s)
    {
        empBasicSalary=s;
    }
    
    int getBasicSalary()
    {
        return empBasicSalary;
    }
    
}
    
 class Main
    {
        public static  void main(String[] args)
        
        {

        Employe e1=new Employe();
        e1.setData(101,"anil",15000);
        e1.showData();

        Employe e2=new Employe();
        e2.setCode(102);
        e2.setName("sunil");
        e2.setBasicSalary(17000);

        e2.showData();

        System.out.println(e2.getCode());
        System.out.println(e2.getName());
        System.out.println(e2.getBasicSalary());

        e1.setBasicSalary(18000);
        System.out.print(e1.getBasicSalary());
    }
 
}