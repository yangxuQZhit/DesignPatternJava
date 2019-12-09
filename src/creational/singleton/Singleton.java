package creational.singleton;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-08 21:19
 * @Version 1.0
 **/
public class Singleton {
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello World.");
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton() {}
}
