/* Static Variable 
 This is Common Variable of Class Objects 
 This is Not Uniique For All Objects 
 Ints Take Space Once Time in class
*/

class Demo1{
    static int a;

    void SetA(int x){
        a=x;
    }

    void show (){
        System.out.println("a = "+a);
    }

}

class StaticVariable{
    public static void main(String[] args) {
        Demo1 ob1 = new Demo1();
        Demo1 ob2 = new Demo1();

        ob1.SetA(10);
        ob1.SetA(20);

        ob1.show();
        ob2.show();
        
    }
}