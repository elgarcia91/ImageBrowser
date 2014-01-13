package imagebrowser;

import imagebrowser.ui.ImageViewer;
import imagebrowser.swing.ApplicationFrame;
import imagebrowser.swing.ActionListenerFactory;
import imagebrowser.swing.ImagePanel;
import imagebrowser.control.Command;
import imagebrowser.model.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class ImageBrowser {
    private Map<String, Command> commandMap;
    private ApplicationFrame frame;

    public static void main(String[] args) {
        new ImageBrowser().execute(args[0]);
    }

    private void execute(String PATH) {
        //persistencia
        frame = new ApplicationFrame(createActionListenerFactory());
        //frame.getViewer().setImage(imagen inicial);
        createCommandMap();
    }

    private ActionListenerFactory createActionListenerFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createCommandMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}