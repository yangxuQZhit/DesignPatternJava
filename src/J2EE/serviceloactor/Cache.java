package J2EE.serviceloactor;

import J2EE.serviceloactor.service.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Cache
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 10:21
 **/
public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String name) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(name)) {
                System.out.println("Returning cached " + name + " object.");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }
}
