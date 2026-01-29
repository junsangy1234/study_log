package chap_01;

public class _04_TypeCasting {
     public static void main(String[] args) {

         //숫자 to 문자
         String s1 = String.valueOf(93);
         s1 = Integer.toString(93);

         System.out.println(s1);

         String s2 = String.valueOf(98.8);
         s2 = Double.toString(98.8);
         System.out.println(s2) ;

         //문자 to 숫자
         int i = Integer.parseInt("93");
         System.out.println(i);
         double d = Double.parseDouble("98.8");
         System.out.println(d);
     }
}
