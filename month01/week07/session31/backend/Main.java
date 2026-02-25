

public class Main {
    public static void main(String[] args) {
        System.out.println("Session 31");
        Bird dove = new Bird("Male", "Pigeon");
        dove.sayHello();

        Dog d1 = new Dog("Male", 2);
        d1.sayHello();

        Cat c1 = new Cat("Female", "black");
        c1.sayHello();

        Dog bullDog = new Dog("Male", 3);
        bullDog.sayHello();

        Cat egyptianCat = new Cat("Male", "grey");
        egyptianCat.sayHello();

        Student s1 = new Student();
        s1.name ="Aagii";
        s1.email ="altan@gmail.com";
        s1.printContact();

        Instructor i1 = new Instructor();
        i1.name ="Bat";
        i1.email = "bat@gmail.com";
        i1.printContact();

        Porshe porshe911 = new Porshe("Velvet", "Porsche");
        porshe911.printInfo();
        Tesla modelS = new Tesla("Balck", "Tesla");
        modelS.printInfo();
        System.out.println("==================");
        System.out.println();

        Triangle t1 = new Triangle("Red", 5, 6.2);
        t1.printInfo();

        Circle ci1 = new Circle("orange", 15.6);
        ci1.printInfo();
        System.out.println();
    }
}
