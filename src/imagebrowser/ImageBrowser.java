package imagebrowser;

import imagebrowser.swing.ApplicationFrame;
import imagebrowser.swing.ActionListenerFactory;
import imagebrowser.control.Command;
import imagebrowser.control.NextImageCommand;
import imagebrowser.control.PrevImageCommand;
import imagebrowser.model.Image;
import imagebrowser.persistence.FileListLoader;
import imagebrowser.persistence.ListLoader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageBrowser {

    private Map<String, Command> commandMap;
    private ApplicationFrame frame;
    private String path;

    public static void main(String[] args) {
        new ImageBrowser().execute(args[0]);
    }

    private void execute(String path) {
        this.path = path;
        ListLoader loader = new FileListLoader(path);
        List<Image> album = loader.load();
        frame = new ApplicationFrame(createActionListenerFactory());
        frame.getViewer().setImage(album.get(0));
        createCommandMap();
    }

    private ActionListenerFactory createActionListenerFactory() {
        return new ActionListenerFactory() {
            @Override
            public ActionListener addAction(final String action) {
                return new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        Command command = commandMap.get(action);
                        if (command == null) {
                            return;
                        }
                        command.execute();
                    }
                };

            }
        };
    }

    private void createCommandMap() {
        commandMap = new HashMap<>();
        commandMap.put("Prev", new PrevImageCommand(frame.getViewer()));
        commandMap.put("Next", new NextImageCommand(frame.getViewer()));
    }
}