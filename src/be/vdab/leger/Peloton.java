package be.vdab.leger;

public class Peloton implements StrijdElement{
private int pelotonNr;

    public Peloton(int pelotonNr) {
        this.pelotonNr = pelotonNr;
    }

    @Override
    public void trekTenStrijde() {
        System.out.println("\tHet peloton "+ pelotonNr +" trekt ten strijde met de volgende soldaten:");

    }
}
