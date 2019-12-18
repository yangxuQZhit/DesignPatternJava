package J2EE.serviceloactor.service;

/**
 * @ClassName Service2
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 10:17
 **/
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2.");
    }
}
