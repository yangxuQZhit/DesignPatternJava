package J2EE.businessdelegate.businessservice;

/**
 * @ClassName BusinessLookup
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 17:27
 **/
public class BusinessLookup {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
