import interfaces.Element;
import interfaces.Picture;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    public String imageName;
    public String url;
    public Image content;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public int get() {
        return 0;
    }

    public void print() {
        System.out.println("Image with name: " + imageName);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public Image content() {
        return null;
    }
}
