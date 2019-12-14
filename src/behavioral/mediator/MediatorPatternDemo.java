package behavioral.mediator;

/**
 * @ClassName MediatorPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 15:14
 **/
public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
