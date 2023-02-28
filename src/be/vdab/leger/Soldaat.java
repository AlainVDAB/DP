package be.vdab.leger;

public class Soldaat implements  StrijdElement {
    private String naam;

    public Soldaat(String naam) {
        this.naam = naam;
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\t\tSoldaat "+naam+" trekt ten strijde");
    }
}
