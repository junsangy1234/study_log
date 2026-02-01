package chap_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class _02_CollectionFramework {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        Scanner in = new Scanner(System.in);

        while(true){
            int size = hs.size();
            System.out.println("입력(현재길이: " + size + "): ");
            int inputData = in.nextInt();
            if(hs.contains(inputData)){
                System.out.println("중복");
                continue;
            }
            hs.add(inputData);
            print(hs.iterator());

        }
    }

    public static void print(Iterator<Integer> it){
        while(it.hasNext()){
            int element = it.next();
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
