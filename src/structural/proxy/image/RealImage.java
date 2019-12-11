package structural.proxy.image;

/**
 * @ClassName RealImage
 * @Description
 * @Author yangxu
 * @Date 2019-12-11 08:42
 **/
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
}
