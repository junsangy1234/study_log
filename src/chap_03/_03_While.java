package chap_03;

public class _03_While {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;

        while (true){
            if (move == distance){
                System.out.println("현재 이동거리: " + move);
                System.out.println("도착했습니다.");
                break;
            }
            System.out.println("현재 이동거리: " + move);
            move +=1;
        }
    }
}
