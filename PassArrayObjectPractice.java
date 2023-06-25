class ArrayObject{
    int a[];
    
    void SetA(int[] t){
        a=t[];
    }
    
    void show(){
        System.out.println("a = "+a);
    }
}

class Main{
    public static void main(String dd[]){
        ArrayObject []ob = new ArrayObject[5];
        ob[0].SetA(1,2,3,4,5);
        
        
    }
}