package behavioral.mediator;

import java.util.Date;

/**
 * @ClassName ChatRoom
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 15:16
 **/
public class ChatRoom {
    public static void showMessage(User user, String msg) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + msg);
    }
}
