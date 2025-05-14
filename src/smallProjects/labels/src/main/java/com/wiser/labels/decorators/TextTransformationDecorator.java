package com.wiser.labels.decorators;

import com.wiser.labels.labels.Label;
import com.wiser.labels.transformations.TextTransformation;

public class TextTransformationDecorator extends LabelDecoratorBase{

    private TextTransformation textTransformation;

    public TextTransformationDecorator(Label label, TextTransformation textTransformation){
        super(label);
        this.textTransformation = textTransformation;
    }

    @Override
    public String getText() {
        return textTransformation.transform(label.getText());
    }
}


