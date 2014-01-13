package imagebrowser.persistence;

import imagebrowser.model.Bitmap;
import imagebrowser.model.Image;

public class ProxyImage extends Image {

    private Image realImage;
    private final ImageLoader loader;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }

    @Override
    public Bitmap getBitmap() {
        checkLoaded();
        return realImage.getBitmap();
    }

    private void checkLoaded() {
        if (realImage == null) {
            realImage = loader.load();
        }
    }
}