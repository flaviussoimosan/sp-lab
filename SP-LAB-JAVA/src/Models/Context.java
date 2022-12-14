package Models;

import Services.AlignStrategy;

public class Context {
    private Services.AlignStrategy AlignStrategy;

    public Context(AlignStrategy alignStrategy) {
        this.AlignStrategy = alignStrategy;
    }

    public String ExecuteStrategy(Paragraph paragraph, Context context){
        return AlignStrategy.RenderStrategy(paragraph, context);
    }
}
