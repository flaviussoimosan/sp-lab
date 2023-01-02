package Services;

import Models.Context;
import Models.Paragraph;

public interface AlignStrategy {
    public String RenderStrategy(Paragraph paragraph, Context context);
}
