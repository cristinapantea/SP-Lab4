import interfaces.Element;
import interfaces.Picture;

import java.awt.*;

public class ImageProxy implements Picture, Element {
    public String url;
    public Dimension dim;
    public Image realImage;

    public ImageProxy(String url) {
        this.url = url;
//        this.dim = dim;
    }

    public Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
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
    public Object content() {
        return null;
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

    @Override
    public void print() {

    }
}
