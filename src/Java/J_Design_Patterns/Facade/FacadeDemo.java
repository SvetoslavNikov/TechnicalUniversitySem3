package Java.J_Design_Patterns.Facade;


//HomeGamingFacade
public class FacadeDemo{
    public static void main(String[] args) {
        GamingFacade gamingFacade = new GamingFacade();
        gamingFacade.startGaming();
        System.out.println();
        gamingFacade.endGaming();
    }
}
class PC{
    public void turnOn(){
        System.out.println("PC turned on");
    }
    public void loadGameClient(){
        System.out.println("GameClientLaunched");
    }


    public void turnOff(){
        System.out.println("PC turned off");
    }
}

class Chair{
    public void adjustHeight(){
        System.out.println("Chair is Adjusted");
    }
    public void adjustArmWrests(){
        System.out.println("ArmWrests adjusted");
    }
}

class Screen{
    public void turnOn(){
        System.out.println("Screen turned on!");
    }

    public void adjustBrightness(){
        System.out.println("Screen Brightness adjusted");
    }

    public void turnOff(){
        System.out.println("Screen turned off");
    }
}
class GamingFacade {
    private PC pc;
    private Chair chair;
    private Screen screen;

    public GamingFacade(){
        this.pc = new PC();
        this.chair = new Chair();
        this.screen = new Screen();
    }

    public void startGaming(){
        pc.turnOn();
        screen.turnOn();
        chair.adjustHeight();
        chair.adjustArmWrests();
        screen.adjustBrightness();
        pc.loadGameClient();
    }

    public void endGaming(){
        pc.turnOff();
        screen.turnOff();
    }
}


