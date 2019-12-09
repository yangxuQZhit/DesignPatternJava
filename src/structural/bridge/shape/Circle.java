package structural.bridge.shape;

import structural.bridge.drawapi.DrawAPI;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 15:22
 * @Version 1.0
 **/
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
