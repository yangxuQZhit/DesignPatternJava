package behavioral.template;

/**
 * @ClassName Cricket
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 11:22
 **/
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
