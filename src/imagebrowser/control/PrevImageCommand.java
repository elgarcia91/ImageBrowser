package imagebrowser.control;

import imagebrowser.ui.ImageViewer;

public class PrevImageCommand implements Command {

    private final ImageViewer viewer;
    
    public PrevImageCommand(ImageViewer viewer) {
        this.viewer = viewer;
    }
    
    @Override
    public void execute() {
        this.viewer.setImage(this.viewer.getImage().getPrev());
    }
}
