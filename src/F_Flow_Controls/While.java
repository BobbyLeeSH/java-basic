package F_Flow_Controls;

public class While {
    public static void main(String[] args) {
        int age = 0;
        int age2 = 0;


//        while (age < 18) {
//            System.out.println("You are " + age + ". You are under age!");
//            age += 1;
//        }
//
//        while (true) {
//            age2++;
//            System.out.println("You are " + age2 + ". You are under age!");
//            if (age2 >= 18) {
//                break;
//            }
//        }
        int age3 = 0;

        while (age3 < 18) {
            age3 += 1;
            if (age3 % 2 == 0) {
                System.out.println("You are " + age3 + ". You are under age!");
                continue;
            }
            System.out.println("hey you turned "+ age3);
        }
    }
}
