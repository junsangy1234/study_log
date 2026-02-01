package final_project;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("첫 번째 숫자: ");
            String input = sc.next();

            if (input == "exit"){
                System.out.println("계산기를 종료합니다.");
                break;
            }

            int num1 = Integer.parseInt(input);

            System.out.print("연산자 (+, -, *, /): ");
            String operator = sc.next();

            System.out.println("두 번째 숫자: ");
            int num2 = sc.nextInt();

            calculator.Calculate(operator,num1,num2);
            calculator.ShowHistory();
        }
    }
}
