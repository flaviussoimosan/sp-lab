package Services;

import Models.Context;
import Models.Paragraph;

public class AlignLeftStrategy implements AlignStrategy{
    @Override
    public String RenderStrategy(Paragraph paragraph, Context context) {
        return ": Alignment - Left";
    }

    public AlignLeftStrategy(){}
}
