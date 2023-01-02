import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private String Title;
    private List<Author> AuthorsList = new ArrayList<Author>();

    public Book(String Title) {
        super();
        this.Title = Title;
    }

    public void AddAuthor(Author authorNameToAdd)
    {
        AuthorsList.add(authorNameToAdd);
    }

    public void AddBookContent(Element elementToAdd) {
        ElementList.add(elementToAdd);
    }

    public void PrintBook(){
        System.out.println("Book:" + Title);
        System.out.println();
        System.out.println("Authors are:");
        for(int i = 0; i < AuthorsList.size(); i++)
            AuthorsList.get(i).PrintAuthor();
        System.out.println();
        for(int i = 0; i < ElementList.size(); i++)
            ElementList.get(i).PrintElement();
    }
}
