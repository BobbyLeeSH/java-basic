package F_Flow_Controls;

public class ForLoop {
    public static void main(String[] args) {

        // I want to print out all the integers from 1 - 20
        // for (starting number; where to stop; increment, decrement)
//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 20; i >= 1; i--) {
//            System.out.println(i);
//        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }


        System.out.println("2 x 2 = " + 2 * 2);


        System.out.println("2 x 9 = " + 2 * 2);

        System.out.println("3 x 2 = " + 2 * 2);
    }
}
