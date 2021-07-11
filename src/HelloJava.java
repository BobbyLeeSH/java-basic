public class HelloJava {
    public static void main(String args[]) {
        System.out.println("Hello Java!");

        int a = 10;
        int b = 3;

        System.out.println(a / (double) b);

        int remainder = a % b;
        System.out.println(remainder);

        int number = 9;
        System.out.println("original number: " + number);
        number += 1;

        System.out.println("original number: " + number++);


    }
}
