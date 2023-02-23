package be.vdab.composite;

public class Grondstofkosten implements Project {
    private final double eenheidsprijs;
    private final double hoeveelheid;

    public Grondstofkosten(double eenheidsprijs, double hoeveelheid) {
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }

    @Override
    public double getKosten(){
      return eenheidsprijs*hoeveelheid;
    }
}
