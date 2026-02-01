package final_project;


import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    protected List<String> history;

    public Calculator() {
        this.history = new ArrayList<>();
    }

    public abstract void Calculate(String operate, int firstNum, int secondNum);

    public void ShowHistory(){
        for(String record : history){
            System.out.println(record);
        }
    }
}
