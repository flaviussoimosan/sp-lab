import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String ImageName;
    private String IUrl;

    public Image(String ImageName) {
        this.ImageName = ImageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void PrintElement() {
        System.out.println("Image: " + this.ImageName);
    }

    @Override
    public void AddElement(Element elementToBeAdded) {

    }

    @Override
    public void RemoveElement(Element elementToBeRemoved) {

    }

    @Override
    public int GetElement(Element getElement) {
        return 0;
    }

    @Override
    public String ImageUrl() {
        return null;
    }

    @Override
    public Dimension ImageDimension() {
        return null;
    }
}
