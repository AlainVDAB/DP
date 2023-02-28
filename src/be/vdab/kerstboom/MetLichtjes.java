package be.vdab.kerstboom;

public class MetLichtjes extends KerstboomDecorator{
    public MetLichtjes(Kerstversiering kerstboom) {
        super(kerstboom);
    }

    @Override
    public String getBeschrijving() {
        return versierdeBoom.getBeschrijving() + ", met lichtjes";
    }
}
