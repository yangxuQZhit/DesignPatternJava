package J2EE.interceptingfilter;

/**
 * @ClassName Client
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 09:36
 **/
public class Client {
    FilterManager manager;

    public void setFilterManager(FilterManager manager) {
        this.manager = manager;
    }

    public void sendRequest(String request) {
        manager.filterRequest(request);
    }
}
