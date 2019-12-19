package J2EE.serviceloactor;

import J2EE.serviceloactor.service.Service;

/**
 * @ClassName ServiceLocatorPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 10:18
 **/
public class ServiceLocatorPatternDemo {
    public static void main(String[] args){
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
