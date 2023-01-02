import Models.*;
import Services.AlignCenterStrategy;
import Services.AlignLeftStrategy;
import Services.AlignRightStrategy;

public class Main {
    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.AddElement(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.AddElement(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.AddElement(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.AddElement(p4);
        cap1.AddElement(new ImageProxy("ImageOne"));
        cap1.AddElement(new Image("ImageTwo"));
        cap1.AddElement(new Paragraph("Some text"));
        cap1.AddElement(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.AcceptVisitor(stats);
        stats.PrintBookStatistics();
    }
}