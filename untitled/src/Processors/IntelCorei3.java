package Processors;

public class IntelCorei3 implements Processor {
    public float frequency;
    public String serialNumber;
    public String name;
    public int cores;
    public int threads;

    @Override
    public float GetFrequency() {
        return 0;
    }

    @Override
    public void SetFrequency(float frequency) {

    }

    @Override
    public String GetName() {
        return null;
    }

    @Override
    public void SetName(String name) {

    }

    @Override
    public int GetCores() {
        return 0;
    }

    @Override
    public void setCores(int cores) {

    }
}
