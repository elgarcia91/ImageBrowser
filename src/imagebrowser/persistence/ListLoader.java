package imagebrowser.persistence;

import imagebrowser.model.Image;
import java.util.List;

public interface ListLoader {
    public abstract List<Image> load();
}
