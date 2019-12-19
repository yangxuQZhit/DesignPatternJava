package J2EE.interceptingfilter;

import J2EE.interceptingfilter.filter.AuthenticationFilter;
import J2EE.interceptingfilter.filter.DebugFilter;

/**
 * @ClassName InterceptingFilterPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 09:16
 **/
public class InterceptingFilterPatternDemo {
    public static void main(String[] args){
        FilterManager manager = new FilterManager(new Target());
        manager.setFilter(new AuthenticationFilter());
        manager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(manager);
        client.sendRequest("home");
    }
}
