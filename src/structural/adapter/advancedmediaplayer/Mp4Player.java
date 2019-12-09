package structural.adapter.advancedmediaplayer;

/**
 * @ClassName Mp4Player
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 14:27
 * @Version 1.0
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {

    }

    @Override
    public void playMp4(String file) {
        System.out.println("Playing mp4 file. Name: " + file);
    }
}
