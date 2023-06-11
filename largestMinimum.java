class MyArray{

    int largestElement(int a[]){

        int i,largest = a[0];
        for(i=0; i<a.length; i++){
            if(a[i] > largest)
                largest = a[i];
        }
        return largest;
    }

    int smallestElement(int a[]){

        int i,smallest = a[0];

        for(i=0; i<a.length; i++){
            if(a[i] < smallest)
                smallest = a[i];
        }
        return smallest;
    }
}

public class largestMinimum{

    public static void main(String arg[]){
        int arr[] = {5,3,8,7,1,9,55,-3};

        MyArray obj = new MyArray();
        System.out.println("Largest element in array is "+obj.largestElement(arr));
           System.out.println("Smallest element in array is "+obj.smallestElement(arr));
    }
}