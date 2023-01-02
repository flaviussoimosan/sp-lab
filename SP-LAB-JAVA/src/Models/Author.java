package Models;

public class Author {
    public String  AuthorName;

    public Author(String Name){
        this.AuthorName = Name;
    }

    public void PrintAuthor()
    {
        System.out.print(this.AuthorName);
    }
}
