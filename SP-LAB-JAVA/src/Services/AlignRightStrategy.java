package Services;

import Models.Context;
import Models.Paragraph;

public class AlignRightStrategy implements AlignStrategy{
    @Override
    public String RenderStrategy(Paragraph paragraph, Context context) {
        return ": Alignment - Right";
    }
}
