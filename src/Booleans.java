public class Booleans {
    public static void main(String[] args) {
        boolean isHotToday = true;
        System.out.println(isHotToday);

        int a = 10;
        int b = 9;

        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a < b);

        String c = "10";
        System.out.println(String.valueOf(a).equals(c));

        int f = 5;
        int g = 5;
        System.out.println(f == g);
        System.out.println(f > g);
        System.out.println(f >= g);

        boolean isFEqualToG = f == g;

        System.out.println(isFEqualToG);
        System.out.println(isFEqualToG);
        System.out.println(isFEqualToG);


        if (f != g) {
            System.out.println("G and F are not equal!");
        } else {
            System.out.println("G and F are equal!");
        }


    }
}
