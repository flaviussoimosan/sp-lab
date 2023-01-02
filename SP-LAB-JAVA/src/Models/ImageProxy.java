package Models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Element, Picture {

    private String ImageUrl;
    private List<Image> ImagesList = new ArrayList<Image>();
    private Dimension ImageDimension;
    private Image RealImage;

    private Image InitializeImage(){
        if(RealImage == null){
            RealImage = new Image(ImageUrl);
        }
        return RealImage;
    }

    public ImageProxy(String imageUrl) {
        this.ImageUrl = imageUrl;
        this.RealImage = null;
    }

    @Override
    public void PrintElement() {
        RealImage = InitializeImage();
        System.out.println("Models.ImageProxy url: " + this.ImageUrl);
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

    @Override
    public void AcceptVisitor(IVisitor visitor) {
        visitor.VisitImageProxyClass(this);
    }
}
