package com.wiser.labels;

import com.wiser.labels.decorators.TextTransformationDecorator;
import com.wiser.labels.labels.Label;
import com.wiser.labels.labels.SimpleLabel;
import com.wiser.labels.transformations.Capitalize;
import com.wiser.labels.transformations.CompositeTransformation;
import com.wiser.labels.transformations.DecorateTransformation;
import com.wiser.labels.transformations.TextTransformation;

import java.util.List;

public class Test {
    public static void main(String[] args){


        Label baselabel = new SimpleLabel("label");
        System.out.println("NO decorators: " + baselabel.getText());

        Label decorated = new TextTransformationDecorator(baselabel,new Capitalize());
        System.out.println("With decorators: " + decorated.getText());
        decorated = TextTransformationDecorator.removeDecorator(decorated, TextTransformationDecorator.class);

        decorated = new TextTransformationDecorator(decorated, new DecorateTransformation());
        System.out.println("With decorators: " + decorated.getText());


        List<TextTransformation> ls = List.of(new Capitalize()
                , new DecorateTransformation());
        CompositeTransformation ct = new CompositeTransformation();
        ct.addTransformation(ls.get(0));
        ct.addTransformation(ls.get(1));

        String result = ct.transform(baselabel.getText());
        System.out.println(result);


    }
}
