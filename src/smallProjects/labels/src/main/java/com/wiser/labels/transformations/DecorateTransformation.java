package com.wiser.labels.transformations;

public class DecorateTransformation implements TextTransformation{

    @Override
    public String transform(String text) {
        validateInput(text);
        return "-={ " + text.trim() + " }=-";
    }
}
