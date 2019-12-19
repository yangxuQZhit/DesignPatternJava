package behavioral.template;

/**
 * @ClassName Game
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 11:20
 **/
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
