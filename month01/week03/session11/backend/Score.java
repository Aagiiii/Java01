

public class Score {
    public static void main(String[] args) {
        int score =75;
        boolean hasBonus = true;
        if (score >= 60 && hasBonus) {
            System.out.println("Passed");
        }

        int day = 6;
        if (day==6 || day ==7) {
            System.out.println("Weekend");
        }

        boolean loggedIn = false;
        if (!loggedIn) {
            System.out.println("Please log in");
        }

    }
}
