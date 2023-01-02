import Models.*;

public class Main {
    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Models.Paragraph 1");
        cap1.AddElement(p1);
        Paragraph p2 = new Paragraph("Models.Paragraph 2");
        cap1.AddElement(p2);
        Paragraph p3 = new Paragraph("Models.Paragraph 3");
        cap1.AddElement(p3);
        Paragraph p4 = new Paragraph("Models.Paragraph 4");
        cap1.AddElement(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.PrintElement();
        p1.SetParagraphAlignementStrategy(new AlignCenterStrategy());
        p2.SetParagraphAlignementStrategy(new AlignRightStrategy());
        p3.SetParagraphAlignementStrategy(new AlignLeftStrategy());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.PrintElement();
    }
}