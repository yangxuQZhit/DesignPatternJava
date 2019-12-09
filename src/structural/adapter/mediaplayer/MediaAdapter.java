package structural.adapter.mediaplayer;

import structural.adapter.advancedmediaplayer.AdvancedMediaPlayer;
import structural.adapter.advancedmediaplayer.Mp4Player;
import structural.adapter.advancedmediaplayer.VlcPlayer;

/**
 * @ClassName MediaAdapter
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 14:29
 * @Version 1.0
 **/
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String type, String file) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(file);
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(file);
        }
    }
}
