package F_Flow_Controls;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        you get an input of a word from the terminal

        we can assume that there is no Capital letters in the input

        check all the alphabets and print the index of the alphabet in the input

        input: bat
        output: 1 0 -1 .... 2 -1 -1 -1

         */
        // 1. get the scanner ready
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word!");
        // 2. read one word
        String input = sc.next();

        // 3.
        for (int i = 97; i<=123; i++){
            char alphabet = (char) i;
            int index = input.indexOf(alphabet);

            System.out.println(index);
        }


    }
}
