package J2EE.interceptingfilter;

/**
 * @ClassName Target
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 09:22
 **/
public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
