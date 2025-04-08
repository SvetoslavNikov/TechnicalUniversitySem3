package Java.J_Design_Patterns.Facade;

public class GamingFacadeTest {
    public static void main(String[] args) {
        GamingFacade gamingFacade = new GamingFacade();
        gamingFacade.startGaming();
        System.out.println();
        gamingFacade.endGaming();
    }
}
