package be.vdab.observer.oef;

public class Main {
    public static void main(String[] args) {
        var kopieermachine = new Fotokopiemachine("456LP");
        kopieermachine.addObserver(new Technieker("Oost458962"));
        kopieermachine.addObserver(new Technieker("Limb487531"));
        kopieermachine.MaakKopie(6);
        kopieermachine.MaakKopie(2);
        kopieermachine.MaakKopie(5);
        kopieermachine.MaakKopie(1);



    }
}
