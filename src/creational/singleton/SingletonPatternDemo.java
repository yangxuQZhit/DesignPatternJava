package creational.singleton;

/**
 * @ClassName SingletonPatternDemo
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 21:25
 * @Version 1.0
 **/
public class SingletonPatternDemo {
    public static void main(String[] args){
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}
