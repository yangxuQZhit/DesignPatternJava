package behavioral.template;

/**
 * @ClassName TemplatePatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 11:20
 **/
public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
