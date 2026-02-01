package final_project.Operation;

public class DividOperation implements CalculatorOperation{
    @Override
    public int Operate(int firstNum, int secondNum) {
        try{
            return firstNum / secondNum;
        } catch (Exception e) {
            System.out.println("0은 나눌수 없습니다.");
            return 0;
        }
    }
}
