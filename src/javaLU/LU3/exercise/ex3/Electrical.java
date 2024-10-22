package javaLU.LU3.exercise.ex3;

public class Electrical {
    private double voltage;
    private String model;
    private String status;

    public Electrical() {
        status = "turned off/turned on";
        model = "undefined model";
        voltage = 0;
    }

    public Electrical(double voltage, String model, String status) {
        setVoltage(voltage);
        setModel(model);
        setStatus(status);
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

    }
}