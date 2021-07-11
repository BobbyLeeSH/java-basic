public class Strings {
    public static void main(String[] args) {
        /*
        int, long, float, double, char, boolean => primitive data types
        String
         */

        int age = 20;

        String address = "109 Repulse Bay, Hong Kong";
        System.out.println(address.indexOf('R'));
        System.out.println(address.indexOf("Repulse"));

        String intro = "My name is Bobby. Bobby is a teacher.";
        System.out.println(intro.indexOf("Bobby"));
        System.out.println(intro.lastIndexOf("Bobby"));

        String introChamin = intro.replaceAll("Bobby", "Chamin").replaceAll("teacher", "student");
        System.out.println(introChamin); // My name is Chamin. Chamin is a teacher

        String introEthan = introChamin.replaceAll("Chamin", "Ethan");
        System.out.println(introEthan);


        String content = "\"Hello Java\" 라는 문자열에서 \"Java\"라는 문자열은 7번째 문자('J')부터 시작이다. 결과값이 6으로 나온 이유는 자바는 숫자를 0부터 세기 때문이다.";
        System.out.println(content.indexOf("Java"));

        String name = "Bobby Lee";
        String firstName = name.substring(0, 5);
        String lastName = name.substring(6);
        String lastNameAlternative = name.substring(6, 9);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(lastNameAlternative);

        String nameOfSchool = "hku";
        String nameOfSchoolInUpperCase = nameOfSchool.toUpperCase();

        System.out.println(nameOfSchool);
        System.out.println(nameOfSchoolInUpperCase);
        System.out.println(nameOfSchoolInUpperCase.toLowerCase());

        String contentWithQuotationMark = "My name is \"Bobby\" \nHello Java";
        System.out.println(contentWithQuotationMark);


    }
}
