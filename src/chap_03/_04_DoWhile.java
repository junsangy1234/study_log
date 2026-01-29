package chap_03;

public class _04_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 25;
        while (move + height < distance){
            System.out.println("Kick keep going");
            System.out.println("Current move distance: " + move);
            move += 3;
        }

        System.out.println("Goal~");

        // Do While
        do{
            System.out.println("Kick keep going");
            System.out.println("Current move distance: " + move);
        }while(move + height < distance);
    }
}
