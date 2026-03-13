

public class Teacher extends Person {
    String role;
    public Teacher( String name, String role){
        super(name);
        this.role = role;
    }

    @Override
    public void introduce() {
        System.out.println("Teacher " + name + "(" + role + ")");
    }
}
