package final_project.Operation;

public class MultiplyOperation implements CalculatorOperation{
    @Override
    public int Operate(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}
