package F_Flow_Controls;

public class If {
    public static void main(String[] args) {

//        int age = 14;
//
//        if (age < 18) {
//            // this line of code only runs if you are under 18
//            System.out.println("you are under age");
//        } else if (age > 18) {
//            // this line of code only runs if you are over 18
//            System.out.println("you are not under age");
//        }  else {
//            // this line of code only runs if you are 18.
//            System.out.println("you are not under age");
//        }


        boolean isHot = false;
        boolean hasCash = false;

        // && || !
        if (isHot && hasCash) {
            System.out.println("Take Uber!");
        } else if (isHot && !hasCash) {
            // hot but no cash
            System.out.println("Take Bus!");
        } else if (hasCash && !isHot){
            // is not hot and you have cash
            System.out.println("Let's buy some chips with the cash");
        } else {
            System.out.println("Do nothing");
        }
















    }
}
