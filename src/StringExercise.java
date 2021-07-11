import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args){
        /*
        Get a line of string
        break down the string into two by the first space
        make the first String to uppercase
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me an input of String with a space");
        String input = scanner.nextLine();

        int breakPoint = input.indexOf(' ');

        String firstString = input.substring(0, breakPoint+1).toUpperCase();
        String lastString = input.substring(breakPoint+1);

        System.out.println("First String: " + firstString);
        System.out.println("Last String: " + lastString);
    }
}
