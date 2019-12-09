package structural.adapter.mediaplayer;

/**
 * @ClassName AudioPlayer
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 14:33
 * @Version 1.0
 **/
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String file) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + file);
        } else if (type.equalsIgnoreCase("vlc")
                || type.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, file);
        } else {
            System.out.println("Invalid media. " + type + " format not supported.");
        }
    }
}
