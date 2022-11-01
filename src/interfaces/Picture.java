package interfaces;

import java.awt.*;

public interface Picture<PictureContent> {
    public String url();
    public Dimension dim();
    public PictureContent content();
}
