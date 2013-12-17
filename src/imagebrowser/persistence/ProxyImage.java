package imagebrowser.persistence;

import imagebrowser.model.Bitmap;
import imagebrowser.model.Image;

public class ProxyImage implements Image {

    private final ImageLoader loader;
    private Image next;
    private Image prev;
    private Image realImage;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }

    @Override
    public void setNext(Image image) {
        this.next = image;
    }

    @Override
    public Image getNext() {
        return next;
    }

    @Override
    public void setPrev(Image image) {
        this.prev = image;
    }

    @Override
    public Image getPrev() {
        return prev;
    }

    @Override
    public Bitmap getBitmap() {
        return realImage.getBitmap();
    }

    
}