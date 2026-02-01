package final_project.Operation;

public class SubtractOperation implements CalculatorOperation{
    @Override
    public int Operate(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
