package imagebrowser.swing;

import imagebrowser.ui.ImageViewer;
import imagebrowser.model.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ImagePanel extends JPanel implements ImageViewer{
    private Image image;
    private int offset;
    private int xPos;

    public ImagePanel(Image image) {
        this.image = image;
        this.offset = 0;
    }

    
    @Override
    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public Image getImage() {
        return image;
    }
    
    @Override
    public void paint(Graphics graphics){
        graphics.drawImage(getBitmap(), offset, 0, null);
    }

    private BufferedImage getBitmap() {
        if(image.getBitmap() instanceof SwingBitmap){
            return getBufferedImage((SwingBitmap) image.getBitmap());
        }
        return null;
    }

    private BufferedImage getBufferedImage(SwingBitmap swingBitmap) {
        return swingBitmap.getBufferedImage();
    }
}