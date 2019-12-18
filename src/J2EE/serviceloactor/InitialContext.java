package J2EE.serviceloactor;

import J2EE.serviceloactor.service.Service1;
import J2EE.serviceloactor.service.Service2;

/**
 * @ClassName InitialContext
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 10:18
 **/
public class InitialContext {
    public Object lookup(String name) {
        if (name.equalsIgnoreCase("service1")) {
            System.out.println("Looking up and creating a new Service1 object.");
            return new Service1();
        } else if (name.equalsIgnoreCase("service2")){
            System.out.println("Looking up and creating a new Service2 object.");
            return new Service2();
        }
        return null;
    }
}
