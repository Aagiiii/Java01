abstract class Animal{
    String name;
    public Animal(String name){
        this.name =name;
    }

   public abstract void makeSound();
   public abstract void move();

   public void introduce(){
    System.out.println("I am " + name + ", I am a " + getClass().getName());
   
   }
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    @Override
    public void move() {
        System.out.println("Running");
    }
}

class Cat extends Animal{

    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
    @Override
    public void move() {
        System.out.println("Sneaking");
    }
}
class Bird extends Animal{

    public Bird(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
    @Override
    public void move() {
        System.out.println("Flying");
    }
}

class Fish extends Animal{

    public Fish(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("...");
    }
    @Override
    public void move() {
        System.out.println("Swimming");
    }
}

public class AnimalSystem {
    public static void main(String[] args) {
        
        Dog d1 = new Dog("Boby");
        Cat c1 = new Cat("Eli");
        Bird b1 = new Bird("red");
        Fish f1 = new Fish("Nemo");

        Animal[] animals = {d1,c1,b1,f1};

        for (Animal animal : animals) {
            animal.introduce();
            animal.makeSound();
            animal.move();
             System.out.println();
        }
    }
}
