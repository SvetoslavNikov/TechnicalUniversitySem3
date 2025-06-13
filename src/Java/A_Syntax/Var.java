package Java.A_Syntax;

import java.util.ArrayList;

public class Var {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("""
            <body>
                <div></div>
                <div></div>
                <div></div>                
            </body>
            """);

        System.out.println(list.get(0));
    }
}
