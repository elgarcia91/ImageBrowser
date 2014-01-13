package imagebrowser.persistence;

import imagebrowser.model.Image;
import imagebrowser.model.RealImage;
import imagebrowser.swing.SwingBitmap;
import java.awt.image.BufferedImage;

public class FileImageLoader implements ImageLoader{
    private final String path;

    public FileImageLoader(String path) {
        this.path = path;
    }
    
    @Override
    public Image load() {
        return new RealImage(new SwingBitmap(loadImage()));
    }

    private BufferedImage loadImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
