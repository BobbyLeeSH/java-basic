package Exercises;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int input = sc.nextInt();

        int temp= 10;

        int two = input + input * 10;
        int three = two + input * 100;

        System.out.println(input + " + " + two + " + " + three + " = " + (input + two + three));
    }
}
