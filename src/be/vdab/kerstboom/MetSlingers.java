package be.vdab.kerstboom;

public class MetSlingers extends KerstboomDecorator{
    public MetSlingers(Kerstversiering kerstboom){
        super(kerstboom);
    }

    @Override
    public String getBeschrijving() {
        return versierdeBoom.getBeschrijving() + ", met slingers";
    }
}
