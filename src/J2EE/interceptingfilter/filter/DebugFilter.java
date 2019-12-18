package J2EE.interceptingfilter.filter;

/**
 * @ClassName DebugFilter
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 09:20
 **/
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
