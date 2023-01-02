public class Image implements Element{
    private String ImageName;

    public Image(String ImageName) {
        this.ImageName = ImageName;
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
}
