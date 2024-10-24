package javaLU.LinearDataStructures.Article.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Methods {
    public static void main(String[] args) {
/*
push(T) – добавя нов елемент на върха на стека
//pop() – връща най-горния елемент и го премахва от стека
//peek() – връща най-горния елемент без да го премахва
size()- връща броя на елементите в стека
contains(Т) -проверява дали даден елемент Т се съдържа в стека
toArray() – връща масив, с елементите на стека
clear() – изтрива всички елементи
 */

        Stack<Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.pop();
        System.out.println(st);
        st.push(3);
        st.push(2);
        System.out.println(st);
        System.out.println(st.peek());//returns last element

        //converting to Array
        Object[] objArray = st.toArray();
        Integer[] intArr = new Integer[objArray.length];
        for (int i = 0; i < objArray.length; i++) {
            intArr[i] = (Integer) objArray[i];
        }


        //Integer.parseInt only use for strings

        try {
            String s = "s123";
            int num = Integer.parseInt(s);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }


    }
}

















