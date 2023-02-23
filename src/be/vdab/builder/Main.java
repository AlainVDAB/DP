package be.vdab.builder;

public class Main {
    public static void main(String[] args) {
        var builder = new Coordinaat.CoordinaatBuilder();
        var coordinaat = builder.metX(12)
                .metY(23)
                .metZ(41)
                .maakCoordinaat();
        //var coordinaat = new Coordinaat(12,45,98);
        System.out.println(coordinaat);
    }

}
