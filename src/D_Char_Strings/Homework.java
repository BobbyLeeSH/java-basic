package D_Char_Strings;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*
        Get an input of strings and make all the "a" into "A"

        Sample Input and Output:
        Input: hello my name is Bobby. I have a Macbook Pro.
        output: hello my nAme is Bobby. I hAve A MAckbook pro.
         */

        // 1. Get the scanner ready
        Scanner sc = new Scanner(System.in);

        // 2. make the scanner read the input. scanner.nextLine()
        System.out.println("Please give me a sentence!");
        String input = sc.nextLine();

        // 3. input.replaceAll("a", "A");
        String modified = input.replaceAll("a", "A");

        // 4. print the modified string
        System.out.println("The modified sentence is: " + modified);
    }
}
