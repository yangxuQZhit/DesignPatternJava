package J2EE.serviceloactor;

import J2EE.serviceloactor.service.Service;

/**
 * @ClassName ServiceLocator
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 10:26
 **/
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String name) {
        Service service = cache.getService(name);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(name);
        cache.addService(service1);
        return service1;
    }
}
