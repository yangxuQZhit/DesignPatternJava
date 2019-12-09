package structural.bridge;

import structural.bridge.drawapi.GreenCircle;
import structural.bridge.drawapi.RedCircle;
import structural.bridge.shape.Circle;
import structural.bridge.shape.Shape;

/**
 * @ClassName BridgePatternDemo
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 15:05
 * @Version 1.0
 **/
public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
