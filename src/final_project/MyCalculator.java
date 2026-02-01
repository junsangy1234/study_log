package final_project;

import final_project.Operation.*;

import java.util.HashMap;
import java.util.Map;

public class MyCalculator extends Calculator{
    private final Map<String, CalculatorOperation> operationMap;

    public MyCalculator() {
        this.operationMap = new HashMap<>();

        operationMap.put("+", new AddOperation());
        operationMap.put("-", new SubtractOperation());
        operationMap.put("*", new MultiplyOperation());
        operationMap.put("/", new DividOperation());
    }

    @Override
    public void Calculate(String operate, int firstNum, int secondNum) {
        CalculatorOperation operation = operationMap.get(operate);

        int result = operation.Operate(firstNum,secondNum);
        System.out.println("결과: " + result);

        super.history.add(firstNum + " " + operate + " " + secondNum + " = " + result);
    }
}
