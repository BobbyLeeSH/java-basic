package Exercises;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a character: ");
        String input = sc.next();
        char character = input.charAt(0);

        int charAscii = character;

        System.out.println("The ASCII value of " + character + " is " + charAscii);

    }
}
