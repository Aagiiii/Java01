


public class Person {
    private String firstName;
    private String lastname;
    private int age;


    public Person(){

    }

    public Person(String firstname, String lastname, int age){
        this.firstName = firstname;
        this.lastname =lastname;
        this.age= age;
    }

    public String getFirstName(){
        return firstName;
    }
     public String getLastName(){
        return lastname;
    }

    public int getAge(){
        return age;
    }
}
