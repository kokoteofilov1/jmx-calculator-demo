import javax.management.StandardMBean;
import java.util.Queue;

public interface CalculatorMBean {
    public double subtract(double x, double y);
    public double add(double x, double y);
    public double multiply(double x, double y);
    public double divide(double x, double y);
    public void reset();
    public double getResultOfLastOperation();
    public Queue<Double> getResultHistory();
}
