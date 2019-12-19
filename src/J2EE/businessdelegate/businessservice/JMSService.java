package J2EE.businessdelegate.businessservice;

/**
 * @ClassName JMSService
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 17:27
 **/
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service.");
    }
}
