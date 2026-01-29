package chap_02;

public class _02_Strings2 {
    public static void main(String[] args) {
        String s = "I love Python and Java and C";

        System.out.println(s.replace(" and",","));
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Python")));
        System.out.println(s.substring(7));

        //공백제거
        s = "             I love Java.         ";
        System.out.println(s.trim());

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 + "," + s2);

        System.out.println(s1.concat(",").concat(s2));
    }
}
