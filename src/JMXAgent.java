import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.StandardMBean;
import java.lang.management.ManagementFactory;

public class JMXAgent {
    private MBeanServer mbs = null;

    public JMXAgent(){
        mbs = ManagementFactory.getPlatformMBeanServer();
    }

    public void registerMBean(Object mBean, ObjectName mBeanName) {
        try {
            mbs.registerMBean(mBean, mBeanName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
