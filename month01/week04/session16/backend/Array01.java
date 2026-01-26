
public class Array01 {
    public static void main(String[] args) {
        System.out.println("Array creation");
        int[] d = { 9, 10, 11, 12 };
        System.out.println(d);
        System.out.println(d[0]);
        System.out.println(d[3]);

        String[] favoriteColors = new String[5];
        favoriteColors[0] = "red";
        favoriteColors[1] = "pink";
        favoriteColors[2] = "blue";
        favoriteColors[3] = "redvet";
        favoriteColors[4] = "orange";
        favoriteColors[1] = "purple";
        // System.out.println(favoriteColors[1]);
        favoriteColors[3] = "darkblue";
        // System.out.println(favoriteColors[3]);

        for (int i = 0; i < favoriteColors.length; i++) {
            System.out.println(favoriteColors[i]);
        }
    }
}
