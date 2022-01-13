import javax.management.ObjectName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JMXAgent jmxAgent = new JMXAgent();
        Calculator calculator = new Calculator();
        ObjectName objectName = null;
        try {
            objectName = new ObjectName("JMXAgent:name=MyCalculator");
        } catch (Exception e) {
            e.printStackTrace();
        }

        jmxAgent.registerMBean(calculator, objectName);

        String end = null;
        Scanner console = new Scanner(System.in);
        System.out.print("Press Enter to terminate:");
        while (end == null) {
            end = console.nextLine();
        }
    }
}

