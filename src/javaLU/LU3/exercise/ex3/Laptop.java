package javaLU.LU3.exercise.ex3;

public class Laptop extends Electrical {
    private int RAM;
    private int hardDrive;

    public Laptop() {
    }

    public Laptop(double voltage, String model, String status, int RAM, int hardDrive) {
        super(voltage, model, status);
        setRAM(RAM);
        setHardDrive(hardDrive);
    }

    public boolean isBetter(Laptop laptop){
        if(this.hardDrive> laptop.getHardDrive() && this.RAM > laptop.getRAM()){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "Voltage: " +  getVoltage()+"\n" +
                "Model:" + getModel()+"\n" +
                "status" + getStatus()+"\n" +
                "RAM: " + getRAM()+"\n" +
                "Hard Drive" + getHardDrive()+"\n";
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
}
