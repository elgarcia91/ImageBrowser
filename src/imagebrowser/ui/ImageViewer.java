package imagebrowser.ui;

import imagebrowser.model.Image;

public interface ImageViewer {

    public void setImage(Image image);

    public Image getImage();

    public void showNext();

    public void showPrev();
    //public void refresh();???
}
