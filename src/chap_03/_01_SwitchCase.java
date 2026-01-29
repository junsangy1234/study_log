package chap_03;

public class _01_SwitchCase {
    public static void main(String[] args) {
        int ranking = 5;

        switch (ranking){
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            case 4:
                System.out.println("4등");
                break;
            default:
                System.out.println("NO");

        }
    }
}
