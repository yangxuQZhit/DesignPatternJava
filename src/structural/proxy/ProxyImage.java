package structural.proxy;

import structural.proxy.image.Image;
import structural.proxy.image.RealImage;

/**
 * @ClassName ProxyImage
 * @Description
 * @Author yangxu
 * @Date 2019-12-11 08:48
 **/
public class ProxyImage implements Image {
    private RealImage image;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(fileName);
            image.display();
        } else {
            image.display();
        }
    }
}
