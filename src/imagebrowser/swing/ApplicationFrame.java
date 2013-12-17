package imagebrowser.swing;

import imagebrowser.ui.ImageViewer;
import imagebrowser.swing.ImagePanel;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame{
    private ImageViewer viewer;
    
    public ApplicationFrame(){
        super("Image Viewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createComponents();
        this.setVisible(true);
    }

    public ImageViewer getViewer() {
        return viewer;
    }
    
    private void createComponents() {
        this.add(createImagePanel());
    }

    private JPanel createImagePanel() {
        ImagePanel panel = new ImagePanel(viewer.getImage());
        this.viewer = panel;
        return panel;
    }

}
