package Models;

public class AlignRightStrategy implements AlignStrategy{
    @Override
    public String RenderStrategy(Paragraph paragraph, Context context) {
        return ": Alignment - Right";
    }
}
