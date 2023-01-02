public class Main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.AddAuthor(rpGheo);
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.AddBookContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.AddBookContent(cap1);
        cap1.AddElement(new Paragraph("Moto capitol"));
        cap1.AddElement(cap11);
        cap11.AddElement(new Paragraph("Text from subchapter 1.1"));
        cap11.AddElement(cap111);
        cap111.AddElement(new Paragraph("Text from subchapter 1.1.1"));
        cap111.AddElement(cap1111);
        cap1111.AddElement(new Image("Image subchapter 1.1.1.1"));
        noapteBuna.PrintBook();
    }
}