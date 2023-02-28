package be.vdab.observer.oef;

public class Technieker implements Observer{
    private final String personeelsnummer;

    public Technieker(String personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    @Override
    public void update(Fotokopiemachine fotokopiemachine) {
        System.out.println( "De technieker met personeelsnummer " + personeelsnummer +
                " is op de hoogte gebracht dat fotokopieermachine" + fotokopiemachine.getSerienummer() +
                " onderhoud nodig heeft");
    }
}
