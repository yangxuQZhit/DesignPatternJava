package behavioral.mediator;

/**
 * @ClassName User
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 15:15
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg) {
        ChatRoom.showMessage(this, msg);
    }
}
