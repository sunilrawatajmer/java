class Sum {
    int a;

    Sum() {
        a = 70;
    }

    Sum(int x) {
        a = x;
    }

    void show() {
        System.out.println("Sum =" + a);
    }

    Sum sum(Sum t1) {
        Sum obj = new Sum();
        obj.a = this.a + t1.a;
        return obj;
    }
}

public class PassingObjectAndSum {
    public static void main(String arr[]) {
        Sum d1 = new Sum();
        Sum d2 = new Sum(30);
        Sum d3 = new Sum();

        d3 = d1.sum(d2);
        d3.show();
    }
}