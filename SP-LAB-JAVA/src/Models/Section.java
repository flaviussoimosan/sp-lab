package Models;

import Models.Element;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String tile;
    public List<Element> ElementList = new ArrayList<Element>();

    public Section(String tile) {
        this.tile = tile;
    }

    public Section() {

    }

    @Override
    public void PrintElement() {
        System.out.println(this.tile);
        for(int i = 0; i < ElementList.size(); i++){
            ElementList.get(i).PrintElement();
        }
    }

    @Override
    public void AddElement(Element elementToBeAdded) {
        ElementList.add(elementToBeAdded);
    }

    @Override
    public void RemoveElement(Element elementToBeRemoved) {

    }

    @Override
    public int GetElement(Element getElement) {
        return 0;
    }

}
