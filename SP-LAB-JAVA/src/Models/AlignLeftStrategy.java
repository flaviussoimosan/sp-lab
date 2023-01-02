package Models;

public class AlignLeftStrategy implements AlignStrategy{
    @Override
    public String RenderStrategy(Paragraph paragraph, Context context) {
        return ": Alignment - Left";
    }

    public AlignLeftStrategy(){}
}
