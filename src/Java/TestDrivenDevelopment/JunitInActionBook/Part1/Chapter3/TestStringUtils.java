package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStringUtils{

    private StringUtils stringUtils = new StringUtils();

    //test Reverse String
    @Test
    public void testReverseString(){
        String s = "abcd efg";
        String result = stringUtils.reverseString(s);
        assertEquals("gfe dcba", result);
    }

    @Test
    public void testNullInput(){
        Assert.assertThrows(IllegalArgumentException.class, () -> stringUtils.reverseString(null));
    }

    @Test
    public void testEmptyStringInput(){
        String s = "";
        assertEquals("",stringUtils.reverseString(s));
    }


    @Test
    public void testOneCharStringInput(){
        String s = "a";
        assertEquals("a",stringUtils.reverseString(s));
    }

    //test isPalindrome
    @Test
    public void testCorrectnessOfIsPalindrome(){
        //even length palindrome
        String s = "dammad";
        //odd length palindrome
        String s1 = "dammimmad";
        String s2 = "notAPalindrome";

        assertEquals(true,stringUtils.isPalindrome(s));
        assertEquals(true,stringUtils.isPalindrome(s1));
        assertEquals(false,stringUtils.isPalindrome(s2));

    }
}
