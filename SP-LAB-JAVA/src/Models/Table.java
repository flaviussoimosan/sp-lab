package Models;

public class Table implements Element{

    //Class placeHolder
    private String TableTitle;

    public Table(String Title){
        this.TableTitle = Title;
    }

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
        visitor.VisitTableClass(this);
    }
}
