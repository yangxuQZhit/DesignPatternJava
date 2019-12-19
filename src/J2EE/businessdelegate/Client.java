package J2EE.businessdelegate;

/**
 * @ClassName Client
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 17:28
 **/
public class Client {
    private BusinessDelegate delegate;

    public Client(BusinessDelegate delegate) {
        this.delegate = delegate;
    }

    public void doTask() {
        delegate.doTask();
    }
}
