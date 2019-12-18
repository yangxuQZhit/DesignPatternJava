package J2EE.frontcontroller;

/**
 * @ClassName FrontControllerPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 08:55
 **/
public class FrontControllerPatternDemo {
    public static void main(String[] args){
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("home");
        frontController.dispatchRequest("student");
    }
}
