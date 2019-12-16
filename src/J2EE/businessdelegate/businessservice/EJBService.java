package J2EE.businessdelegate.businessservice;

/**
 * @ClassName EJBService
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 17:27
 **/
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service.");
    }
}
