public class Multiprocessor {
    private int cpu;
    private int cores;
    private double clockFrequency;

    public Multiprocessor() {
    }

    public Multiprocessor(int cpu, int cores, double clockFrequency) {
        setCpu(cpu);
        setCores(cores);
        setClockFrequency(clockFrequency);
    }

    public double transform(){
        if(cores>1 && cpu >1) {
            return (0.7 * cores) * (0.8 * cpu) * (clockFrequency);
        } else {
        return (0.7 * 1) * (0.8 * 1) * (clockFrequency);
        }
    }

    public double time(double time){
        double totaltime = time*clockFrequency;
        return totaltime;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }
}
