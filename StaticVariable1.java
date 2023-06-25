/* Static Variable 
 This is Common Variable of Class Objects 
 This is Not Uniique For All Objects 
 Ints Take Space Once Time in class

*/

class Demo1{
    static int a;
    int b;

    void SetA(int x,int y){
        a=x;
        b=y;
    }

    void show (){
        System.out.println("a = "+a+ " b = "+b);
    }

}

class StaticVariable{
    public static void main(String[] args) {
        Demo1 ob1 = new Demo1();
        Demo1 ob2 = new Demo1();

        ob1.SetA(10,50);
        ob2.SetA(20,100);

        ob1.show();
        ob2.show();
        
    }
}