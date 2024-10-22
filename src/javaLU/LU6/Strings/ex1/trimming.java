package javaLU.LU6.Strings.ex1;

public class trimming {
    public static void main(String[] args) {
        String str = "2";

        int a = Integer.parseInt(str);
        int b = Integer.valueOf(str);

        String str2 = String.valueOf(a);
        String str3 = Integer.toString(a);
        System.out.println(TrimTrailingSpaces("  MADAFACKA  OK OPK  "));
        System.out.println(("  MADAFACKA  OK OPK  ").trim());



    }

    private static String TrimTrailingSpaces(String str){
        if(str == null){
            System.out.println("The object refers to null");
            return null;
        }
        int newLength = str.length();
        for(int i = newLength-1; i > 0; i--){
            if(Character.isWhitespace(str.charAt(i))){
                newLength--;
            } else{
                break;
            }

        }
        return str.substring(0, newLength);
    }
}
