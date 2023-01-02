package Models;

public class TableOfContents implements Element {
    @Override
    public void PrintElement() {

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
    public void AcceptVisitor(IVisitor visitor) {
        visitor.VisitTableOfContentsClass(this);
    }

    //Class placeHolder
}
