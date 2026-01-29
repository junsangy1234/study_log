package chap_02;

import java.util.Locale;

public class _01_Strings1 {
    public static void main(String[] args) {
        String s = "I love Python and Java and C";

        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));

        System.out.println(s.indexOf("Python"));

        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));

        System.out.println(s.startsWith("I love"));
        System.out.println(s.endsWith("C"));
    }
}
