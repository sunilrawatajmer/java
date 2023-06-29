/*Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute.
 Calculate the area and circumference of the circle.*/

public class CircleAreaUsingConstructor {
    public static void main(String[] args) {
        Circle ob1 = new Circle(2.5f);
      ob1.showArea();
      ob1.showcircumference();
      
      Circle ob2 = new Circle(5f);
      ob2.showArea();
      ob2.showcircumference();
      
      
        
    }
}

class Circle {
    float radius;
    float PI =3.14f;

    Circle(float r){
        radius=r;
    }

    float getArea(){
        float area ;
        area = PI * radius * radius;
        return area;
    }
    float getCircumference(){
        float circum;
        circum = 2*PI*radius;
        return circum;
    } 

    void showArea(){
        System.out.println("Area Of Circle = "+getArea());
    }
    
    void showcircumference (){
        System.out.println("Circumference  of Circle = "+getCircumference());
    }


}
