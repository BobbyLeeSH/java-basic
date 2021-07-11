package Exercises;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        double radius = sc.nextDouble();

        System.out.println("The perimeter is " + 2 * radius * Math.PI);
        System.out.println("The area is " + radius * radius * Math.PI);
    }
}
