///Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class,
 //set their attributes using the constructor, and print their name and age.
public class PersonManage {
    public static void main(String[] args) {
        Person p1 = new Person("Sunil", 19);
        Person p2 = new Person("Renu",18);

        p1.showData();
        p2.showData();
    }
}

class Person {
    String personName;
    int personAge;

    Person(String nm ,int a){
        personName=nm;
        personAge=a;
    }

    void showData(){
        System.out.println("Name = "+personName + " Age = "+personAge);
    }
}
