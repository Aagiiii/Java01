
class Person{
    String name;
    int age;
    String city;
    
    void introduce(){
        // System.out.println("===Person===");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("City: "+ city);
        System.out.println();
    }
}

public class PersonPractice {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        Person p1 = new Person();
        p1.name = "Bat";
        p1.age =23;
        p1.city ="UB";
        // p1.introduce();

        people[0]=p1;

        Person p2 = new Person();
        p2.name = "George";
        p2.age =28;
        p2.city ="USA";
        // p2.introduce();

         people[1]=p2;

        Person p3 = new Person();
        p3.name = "Jane";
        p3.age =19;
        p3.city ="UK";
        // p3.introduce();

         people[2]=p3;

         for (int i = 0; i < people.length; i++) {
            System.out.println("=== Person " + (i+1) + " ===");
            people[i].introduce();
         }
}}
