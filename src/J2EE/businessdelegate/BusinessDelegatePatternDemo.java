package J2EE.businessdelegate;

/**
 * @ClassName BusinessDelegatePatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 17:18
 **/
public class BusinessDelegatePatternDemo {
    public static void main(String[] args){
        BusinessDelegate delegate = new BusinessDelegate();
        Client client = new Client(delegate);

        delegate.setServiceType("EJB");
        client.doTask();
        delegate.setServiceType("JMS");
        client.doTask();
    }
}
