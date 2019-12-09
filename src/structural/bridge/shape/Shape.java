package structural.bridge.shape;

import structural.bridge.drawapi.DrawAPI;

/**
 * @ClassName Shape
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 15:21
 * @Version 1.0
 **/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
