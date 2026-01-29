package chap_04;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = new String[] {"커피", "카페모카", "라떼", "카푸치노"};

        /*for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
        }*/

        for(String coffee : coffees){
            System.out.println(coffee);
        }
    }
}
