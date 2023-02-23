package be.vdab.facade;

public class Versterker {
    private boolean power=true;
    public final static String naam = "Versterker";

    public boolean schakel(){
        power= !power;
        return power;
    }

    public boolean isPower() {
        return power;
    }
}
