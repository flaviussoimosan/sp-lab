package Models;

public interface IVisitor {
    void VisitBookClass(Book book);
    void VisitSectionClass(Section section);
    void VisitTableOfContentsClass(TableOfContents tableOfContents);
    void VisitParagraphClass(Paragraph paragraph);
    void VisitImageProxyClass(ImageProxy imageProxy);
    void VisitImageClass(Image image);
    void VisitTableClass(Table table);
}
