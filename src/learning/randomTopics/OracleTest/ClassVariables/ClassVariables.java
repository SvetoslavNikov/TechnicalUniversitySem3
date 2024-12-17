package learning.randomTopics.OracleTest.ClassVariables;

public class ClassVariables {

    static String s = "damn"; // class variable (static)
    private static final boolean b = true; // class variable (static, final)
    double d = 5, dd = 6; // instance variables

    public void main(String[] args) {
        final String s1 = "dammit"; // local variable (final)

        // Non-static methods can access both instance and class variables.
    }
}
