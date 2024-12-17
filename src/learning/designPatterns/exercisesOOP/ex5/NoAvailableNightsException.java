package learning.designPatterns.exercisesOOP.ex5;

public class NoAvailableNightsException extends Exception{
    @Override
    public String getMessage() {
        return "No available Nights Exception";
    }
}
