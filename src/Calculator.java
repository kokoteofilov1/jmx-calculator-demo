import java.util.PriorityQueue;
import java.util.Queue;

public class Calculator implements CalculatorMBean {
    private double result;
    private Queue<Double> resultHistory;

    public Calculator() {
        this.result = 0;
        this.resultHistory = new PriorityQueue<>();
    }

    @Override
    public double subtract(double x, double y) {
        this.result = x - y;
        resultHistory.add(result);
        return result;
    }

    @Override
    public double add(double x, double y) {
        this.result = x + y;
        resultHistory.add(result);
        return result;
    }

    @Override
    public double multiply(double x, double y) {
        this.result = x * y;
        resultHistory.add(result);
        return result;
    }

    @Override
    public double divide(double x, double y) {
        this.result = x / y;
        resultHistory.add(result);
        return result;
    }

    @Override
    public void reset() {
       this.result = 0;
    }

    @Override
    public double getResultOfLastOperation() {
        return result;
    }

    @Override
    public Queue<Double> getResultHistory() {
        return resultHistory;
    }
}
