package structural.adapter.advancedmediaplayer;

/**
 * @ClassName VlcPlayer
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 13:27
 * @Version 1.0
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {
        System.out.println("Playing vlc file. Name: " + file);
    }

    @Override
    public void playMp4(String file) {

    }
}
