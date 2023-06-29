public class ReturnSumOfEvenInArray {
    public static void main(String[] args) {
        Integer []arr = {1,2,10,4,5};
        EvenSum ob  = new EvenSum();
        int evenResult;
        evenResult=ob.getEvenSum(arr);
        System.out.println("Sum of Even = "+evenResult);
    }
}

class EvenSum{
    int evenTotal=0;

    int getEvenSum(Integer[] tmp){
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]%2==0){
                evenTotal=evenTotal+tmp[i];
            }
        }

        return evenTotal;
    }
}
