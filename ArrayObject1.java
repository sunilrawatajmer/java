public class ArrayObject1 {
    public static void main(String[] args) {
        Employee []arr=new Employee[2];
        // arr[0]=new Employee();
        // arr[1]=new Employee();
        // arr[0].setValue(101,"sunil");
        // arr[1].setValue(101,"sunil");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=new Employee();
            
        }
        arr[0].setValue(102,"Sunil");
        arr[1].setValue(101,"Sahil");
        arr[0].showData();
        arr[1].showData();
    }
}

class Employee{
    int emp_Code;
    String emp_Name;

    void setValue(int c,String nm){
        emp_Code=c;
        emp_Name=nm;
    }

    void showData(){
        System.out.println("Code = "+emp_Code + "  Name ="+emp_Name);
    }
}
