package learning.designPatterns.SolidPrinciples.LiskovSubstitionPrinciple;
/*
public class Corrected {

    public static void main(String[] args) {
        Bird sparrow = new Sparrow(50);
        Bird penguin = new Penguin(20);

        System.out.println("Sparrow Population: " + sparrow.getPopulation());
        System.out.println("Penguin Population: " + penguin.getPopulation());

        if (sparrow instanceof CanFly) {
            ((CanFly) sparrow).fly();  // Outputs: Sparrow is flying
        }

        // Penguin doesn't have fly method, so no need to check for flying
        // No flying behavior for Penguin, it doesn't implement CanFly
    }


}

interface CanFly {
    public void fly();
}

class Bird {
    int population;

    public Bird(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}

class Sparrow extends Bird {

    public Sparrow(int population) {
        super(population);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    public Penguin(int population) {
        super(population);
    }
}


 */