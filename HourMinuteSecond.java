import java.util.Scanner;

class Time{
    int h,m,s;
    
    Time (){
        h=0;
        m=0;
        s=0;
    }
    
    Time (int hr,int mt,int sc){
        h=hr;
        m=mt;
        s=sc;
    }
    
    void show (){
        System.out.println("Timing = "+h +":"+m+":"+s);
    }
    
    
    
    Time fun (Time t){
        Time obj = new Time ();
       obj.m=(t.m+this.m)%60;
      obj.s=(t.s+this.s)%60;
      obj.m=(this.m+t.m)%60 + (t.s+this.s)/60;
      obj.h=this.h+t.h + (t.m+this.m)/60;
     
        return obj;
    }
}

class HourMinuteSecond{
    public static void main(String arr[]){
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter Hour for t1 : ");
        int h1=ob.nextInt();
         System.out.print("Enter Minute for t1 : ");
        int m1=ob.nextInt();
         System.out.print("Enter Second for t1 : ");
        int s1=ob.nextInt();

        System.out.println();

         System.out.print("Enter Hour for t2 : ");
        int h2=ob.nextInt();
         System.out.print("Enter Minute for t2 : ");
        int m2=ob.nextInt();
         System.out.print("Enter Second for t2 : ");
        int s2=ob.nextInt();
        Time t1 = new Time (h1,m1,s1);
        Time t2 = new Time(h2,m2,s2);
         Time t3 = new Time ();
         
         t3=t1.fun(t2);
         t3.show();
        
    }
}