package structural.bridge.drawapi;

/**
 * @ClassName RedCircle
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 15:09
 * @Version 1.0
 **/
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle [ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
