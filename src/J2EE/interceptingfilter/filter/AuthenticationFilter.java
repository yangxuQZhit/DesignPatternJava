package J2EE.interceptingfilter.filter;

/**
 * @ClassName AuthenticationFilter
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 09:17
 **/
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
