class ArrayObject{
    int a;
    
    void SetA(int x){
        a=x;
    }
    
    void show(){
        System.out.println("a = "+a);
    }
}

class ArrayObject2{
    public static void main(String dd[]){
        ArrayObject []ob = new ArrayObject[5];
        
        for(int i=0;i<5;i++){
            ob[i]=new ArrayObject();
            ob[i].SetA(i);
            ob[i].show();
        }
    }
}
