package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter3;

public class StringUtils {

    public String reverseString(String s){
        if(s == null){
            throw new IllegalArgumentException();
        }

        StringBuilder sBuild = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sBuild.append(s.charAt(s.length()- 1 -i));
        }
        return sBuild.toString();
    }

    public boolean isPalindrome(String s){
        return reverseString(s).equals(s);
    }
}

