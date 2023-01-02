public class Paragraph implements Element {

    private String ParagraphText;

    public Paragraph(String ParagraphText) {
        this.ParagraphText = ParagraphText;
    }

    @Override
    public void PrintElement() {
        System.out.println("Paragraph: " + this.ParagraphText);
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

    public void SetParagraphAlignementStrategy(AlignStrategy alignStrategy)
    {
        Context context = new Context(alignStrategy);
        this.ParagraphText = this.ParagraphText + context.ExecuteStrategy(this, context);
    }
}
