package be.vdab.kerstboom;

public class MetBallen extends KerstboomDecorator{

    public MetBallen(Kerstversiering kerstboom) {
        super(kerstboom);
    }

    @Override
    public String getBeschrijving() {
        return versierdeBoom.getBeschrijving()
                + ", met ballen";
    }
}
