package chap_05;

public class _02_Overloading {
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt((strNumber));
        return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {

        //오버로딩: 전달값 다르면 함수 이름 같아도 다르게 취급(입력값 개수, 형에 따라서)
        System.out.println(getPower(2));
        System.out.println(getPower("2"));
        System.out.println(getPower(2,3));

    }
}
