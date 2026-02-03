class Student{
    String name;
    int id;
    int score;

    Student(String name, int id, int score){
        this.name = name;
        this.id = id;
        this.score =score;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Assessment: " + getGrade());
        System.out.println("isPassed: " + isPassed());
        System.out.println();
    }

    String getGrade() {
        if (score >100 && score <0) {
            return "-1";
        }else if(score >=0 && score <=59){
            return "F";
            
        }else if(score >=60 && score <=69){
            return "D";
        }else if(score >=70 && score <=79){
            return "c";
        }else if(score >=80 && score <=89){
            return "B";
        }else{
           return "A";
        }
    }

    boolean isPassed(){
        if (score >= 60) {
            return true;
        }else{
            return false;
        }
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        Student s1 = new Student("Bat", 0, 85);
        Student s2 = new Student("Jane", 0, 95);
        Student s3 = new Student("Dorj", 0, 55);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
