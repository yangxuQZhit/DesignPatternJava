package structural.proxy;

/**
 * @ClassName ProxyPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-11 08:40
 **/
public class ProxyPatternDemo {
    public static void main(String[] args){
        ProxyImage image = new ProxyImage("test.png");
        image.display();
        System.out.println(" ");
        image.display();
    }
}
