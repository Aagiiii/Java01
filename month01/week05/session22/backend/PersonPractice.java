
class Person{
    String name;
    int age;
    String city;
    
    void introduce(){
        System.out.println("===Person===");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("City: "+ city);
        System.out.println();
    }
}

public class PersonPractice {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bat";
        p1.age =23;
        p1.city ="UB";
        p1.introduce();

        Person p2 = new Person();
        p2.name = "George";
        p2.age =28;
        p2.city ="USA";
        p2.introduce();

        Person p3 = new Person();
        p3.name = "`Jane";
        p3.age =19;
        p3.city ="UK";
        p3.introduce();
}}
