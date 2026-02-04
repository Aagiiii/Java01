
public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.age = 4;
        c1.gettingOld();
        System.out.println(c1.age);

        Animal a1 = new Animal();
        a1.name = "Boby";
        a1.age = 4;
        a1.category = "Dog";
        System.out.println(a1.getPropertyName());
        System.out.println(a1.getPropertyAge());
        System.out.println(a1.getPropertyCategory());

        Human h1 = new Human();
        // h1.humanName = "aa";
       System.out.println(h1.getName());
       System.out.println(h1.getAge());

    }
}
