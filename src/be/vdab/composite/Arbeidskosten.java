package be.vdab.composite;

public class Arbeidskosten implements Project{
    private final double uurloon;
    private final double gewerkteUren;

    public Arbeidskosten(double uurloon, double gewerkteUren) {
        this.uurloon = uurloon;
        this.gewerkteUren = gewerkteUren;
    }

    @Override
    public double getKosten() {
        return uurloon*gewerkteUren;
    }
}
