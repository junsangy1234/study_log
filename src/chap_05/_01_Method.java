package chap_05;

public class _01_Method {

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static long powerByExp(int number, int exponent){
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerByExp(2,50));
    }
}
