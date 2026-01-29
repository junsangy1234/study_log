package chap_02;

public class _03_Compares {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals("java"));

        System.out.println(s1.equalsIgnoreCase("java"));

        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2));
    }
}
