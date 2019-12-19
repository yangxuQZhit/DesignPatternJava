package J2EE.frontcontroller;

/**
 * @ClassName Dispatcher
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 08:57
 **/
public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("student")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
