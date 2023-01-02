package Models;

public class BookStatistics implements IVisitor {
    int BookVisitedCount;
    int SectionVisitedCount;
    int TableOfContentVisitedCount;
    int ParagraphVisitedCount;
    int ImageProxyVisitedCount;
    int ImageVisitedCount;
    int TableVisitedCount;

    public BookStatistics() {
    }


    @Override
    public void VisitBookClass(Book book) {
        BookVisitedCount++;
    }

    @Override
    public void VisitSectionClass(Section section) {
        SectionVisitedCount++;
    }

    @Override
    public void VisitTableOfContentsClass(TableOfContents tableOfContents) {
        TableOfContentVisitedCount++;
    }

    @Override
    public void VisitParagraphClass(Paragraph paragraph) {
        ParagraphVisitedCount++;
    }

    @Override
    public void VisitImageProxyClass(ImageProxy imageProxy) {
        ImageProxyVisitedCount++;
    }

    @Override
    public void VisitImageClass(Image image) {
        ImageVisitedCount++;
    }

    @Override
    public void VisitTableClass(Table table) {
        TableVisitedCount++;
    }

    public void PrintBookStatistics() {
        System.out.println("Section class visited: " + SectionVisitedCount);
        System.out.println("Table of Content class visited: " + TableOfContentVisitedCount);
        System.out.println("Paragraph class visited: " + ParagraphVisitedCount);
        System.out.println("Image Proxy class visited: " + ImageProxyVisitedCount);
        System.out.println("Image class visited: " + ImageVisitedCount);
        System.out.println("Table class visited: " + TableVisitedCount);
    }
}
