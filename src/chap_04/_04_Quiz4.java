package chap_04;

public class _04_Quiz4 {
    public static void main(String[] args) {
        int[] shoseSize = new int[10];

        int minSize = 250;

        for (int i = 0; i < shoseSize.length; i++) {
            shoseSize[i] = minSize;
            minSize += 5;
        }

        for (int size : shoseSize){
            System.out.println(size);
        }
    }
}
