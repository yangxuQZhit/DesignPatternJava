package J2EE.serviceloactor.service;

/**
 * @ClassName Service1
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 10:16
 **/
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1.");
    }
}
