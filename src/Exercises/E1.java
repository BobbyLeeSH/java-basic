package Exercises;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int input = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " x "+ i + " = " + i * input);
        }

    }
}
