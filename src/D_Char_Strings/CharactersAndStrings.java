package D_Char_Strings;

public class CharactersAndStrings {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        String c = "hello";
        String d = String.valueOf(a) + b;

        System.out.println(a);
        System.out.println(a + b);
        System.out.println(c + 21);
        System.out.println(d);

        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u0061';

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        /*
        char 데이터 타입은 기본적으로 하나의 character만 들어갈 수 있습니다.
        나이를 char 형태로 표현 하려고 한다면, 9살까지는 표현 할 수 있지만 10살 부터는 char 데이터 타입으로 표현할 수 없습니다.
         */
        char age1 = '9';
//        char age2 = '10';
    }
}
