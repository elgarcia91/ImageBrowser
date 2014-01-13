package imagebrowser.control;

import imagebrowser.ui.ImageViewer;

public abstract class ImageCommand implements Command {
    private ImageViewer viewer;

    public ImageCommand(ImageViewer viewer) {
        this.viewer = viewer;
    }
    
    public ImageViewer getViewer(){
        return viewer;
    }
}