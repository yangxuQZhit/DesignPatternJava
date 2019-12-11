package structural.facade;

/**
 * @ClassName FacadePatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-10 22:50
 **/
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeMaker maker = new ShapeMaker();

        maker.drawCicle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
