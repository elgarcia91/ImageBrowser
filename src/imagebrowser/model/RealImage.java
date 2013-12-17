package imagebrowser.model;

public class RealImage implements Image{
    private final Bitmap bitmap;

    public RealImage(Bitmap bitmap) {
        this.bitmap = bitmap;
    }


    @Override
    public void setNext(Image image) {
    }

    @Override
    public Image getNext() {
        return null;
    }

    @Override
    public void setPrev(Image image) {
    }

    @Override
    public Image getPrev() {
        return null;
    }
    
    @Override
    public Bitmap getBitmap(){
        return bitmap;
    }

}
