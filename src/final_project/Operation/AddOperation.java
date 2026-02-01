package final_project.Operation;

public class AddOperation implements CalculatorOperation {
    @Override
    public int Operate(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}
