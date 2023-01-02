package Services;

import Models.Context;
import Models.Paragraph;

public class AlignCenterStrategy implements AlignStrategy{
    @Override
    public String RenderStrategy(Paragraph paragraph, Context context) {
        return ": Alignment - Center";
    }

    public AlignCenterStrategy(){

    }
}
