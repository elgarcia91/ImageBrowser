package imagebrowser;

import imagebrowser.ui.ImageViewer;
import imagebrowser.swing.ApplicationFrame;
import imagebrowser.swing.ActionListenerFactory;
import imagebrowser.swing.ImagePanel;
import imagebrowser.control.Command;
import imagebrowser.model.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.imageio.ImageIO;

public class ImageBrowser {

    public static void main(String[] args) {
        new ImageBrowser().execute();
    }
    private static final String PATH = "C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg";
    private Map<String, Command> commandMap;

    private void execute() {
        Image[] images = linkImages(createImages());
        ApplicationFrame applicationFrame = new ApplicationFrame();
        ImageViewer viewer = createImageViewer(images[0]);
        ActionListenerFactory factory = createActionListenerFactory();
    }

    private Image[] linkImages(Image[] images) {
        for (int i = 0; i < images.length; i++) {
            Image image = images[i];
            image.setNext(images[(i+1)% images.length]);
            image.setPrev(images[(i-1)% images.length]);
        }
        return images;
    }

    private Image[] createImages() {
        //TODO Crear el vector de imagenes. 
    }

    private ImageViewer createImageViewer(Image image) {
        ImageViewer viewer = new ImagePanel(image);
        return viewer;
    }

    private ActionListenerFactory createActionListenerFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}