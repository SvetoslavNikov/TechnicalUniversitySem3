package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//suit

@RunWith(Suite.class)
//Detected by Junit, so it runs this class as a Suite

@Suite.SuiteClasses({TestStringUtils.class, TestMathUtils.class})
//Specify the test classes

public class testSuiteExample {
    //run this and it will run the tests
}
