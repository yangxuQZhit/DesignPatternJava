package structural.bridge.drawapi;

/**
 * @ClassName GreenCircle
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 15:20
 * @Version 1.0
 **/
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle [ color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
