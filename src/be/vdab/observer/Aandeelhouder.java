package be.vdab.observer;

public class Aandeelhouder implements Observer{
    private final String voornaam;

    public Aandeelhouder(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void update(Aandeel aandeel) {
        System.out.println(voornaam + " koopt of verkoopt " + aandeel.getCode() +
                " met koers " + aandeel.getKoers());

    }
}
