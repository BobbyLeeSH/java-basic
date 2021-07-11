package G_Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] odds = {1, 3, 5, 7, 9};

        int[] odds2 = new int[5];
        odds2[0] = 1;
        odds2[1] = 3;
        odds2[2] = 5;
        odds2[3] = 7;
        odds2[4] = 9;

        System.out.println(odds[2]);

        char a = 1;
        System.out.println(a);

        for (int i = 0; i < 5; i++) {
            System.out.println("odds: " + odds[i]);
            System.out.println("odds2: " + odds2[i]);
//            System.out.println(odds[i] == odds2[i]);
        }


        String name = "Bobby";
        char[] nameInArray = name.toCharArray();
        // char[] nameInArray = {'B', 'o', 'b', 'b', 'y'};
        System.out.println( name.charAt(4) );
    }
}
