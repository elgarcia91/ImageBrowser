package imagebrowser.model;

public interface Image {
    
    public void setNext(Image image);
    public Image getNext();
    public void setPrev(Image image);
    public Image getPrev();
    public Bitmap getBitmap();
}
