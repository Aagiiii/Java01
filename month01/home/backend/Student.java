

public class Student extends Person{
    String grade;

    public Student(String name, String grade){
        super(name);
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.println("Student: " + name + "(" + grade + ")"
        );
    }
}
