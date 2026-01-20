

public class Age {
    public static void main(String[] args) {
        int age =25;
        String category;
        if (age <13) {
            category = "Kid";
        } else if (age <20) {
            category = "Teen";
        }else if (age <60) {
            category = "Adult";
        }else{
            category =" Old";
        }
        System.out.println(category);
    }
}

