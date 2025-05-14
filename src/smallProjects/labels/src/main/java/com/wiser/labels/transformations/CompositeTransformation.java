package com.wiser.labels.transformations;

import java.util.ArrayList;
import java.util.List;

//TODO: Should do it with add/remove? v1
//      Or should we make a TextTransformationFactory? v2
//      Input Label or Text?

//v1 - add/remove (standard composite)
public class CompositeTransformation implements TextTransformation {
    private List<TextTransformation> textTransformations;

    public CompositeTransformation() {
        this.textTransformations = new ArrayList<>();
    }

    public void addTransformation(TextTransformation textTransformation){
        textTransformations.add(textTransformation);
    }

    public void removeTransformation(TextTransformation textTransformation){
        if(textTransformations.contains(textTransformation)){
            textTransformations.remove(textTransformation);
        }
    }
    @Override
    public String transform(String text) {
        validateInput(text);
        for(TextTransformation t: textTransformations){
            text = t.transform(text);
        }
        return text;
    }
}



//
////v2 - composite with String input option(Factory pattern)
//class CompositeTransformationV2 implements TextTransformation{
//    private String text;
//    private List<TextTransformation> textTransformations;
//
//    public CompositeTransformationV2(String text, String textTransformations) {
//        this.text = text;
//        this.textTransformations = TextTransformationFactory.getTextTransformation(textTransformations);
//    }
//    @Override
//    public String transform(String text) {
//        for(TextTransformation t: textTransformations){
//            text = t.transform(text);
//        }
//        return text;
//    }
//}
//
//
//// TODO: one-input one-output (handle multiples in the composite constructor i think its bad?
////      one-input List-output?
////      do i use reflection?
//class TextTransformationFactory{
//
//    public static List<TextTransformation> getTextTransformation(String representations){
//        try(Scanner scanner = new Scanner(representations)){
//            if(!scanner.hasNext()) {
//                throw new IllegalArgumentException("Empty input in the TextTransformationFectory");
//            }
//            //I will use TT for TextTransformation
//            String TTtype = scanner.next();
//
//        }
//        return new ArrayList<TextTransformation>();
//    }
//}



