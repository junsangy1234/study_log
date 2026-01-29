package chap_03;

public class _05_Quize3 {
    public static void main(String[] args) {
        int hourlyPirce = 4000;
        int maxPrice = 30000;
        boolean isSale = false;

        int hour = 5;

        int currentPrice = (hourlyPirce * hour > maxPrice) ? 30000 : hourlyPirce * hour;

        if (isSale){
            System.out.println("가격: " + currentPrice/2);
        }
        else{
            System.out.println("가격: " + currentPrice);
        }

    }
}
