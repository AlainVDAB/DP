package be.vdab.kerstboom;

abstract class KerstboomDecorator implements Kerstversiering{
 protected final Kerstversiering versierdeBoom;
    public KerstboomDecorator(Kerstversiering kerstboom) {
       versierdeBoom=kerstboom;
    }
}
