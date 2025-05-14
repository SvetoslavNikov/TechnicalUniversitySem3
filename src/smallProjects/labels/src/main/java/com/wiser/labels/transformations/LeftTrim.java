package com.wiser.labels.transformations;

public class LeftTrim implements TextTransformation{
    @Override
    public String transform(String text) {
        validateInput(text);
        return text.replaceAll("^\\s+","");
    }
}
