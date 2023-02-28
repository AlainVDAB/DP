package be.vdab.strategy;

public class Main {
    public static void main(String[] args) {
        var personen = new Persoon[] {
                new Persoon("Jean", "Smits", "heer"),
                new Persoon("Jeanine", "Desmet", "mevrouw")};
// briefhoofdingen met informele aansprekingen:
        for (var persoon : personen) {
            System.out.println(persoon.maakBriefHoofding((pers) ->
                    "Dag " + pers.getVoornaam()));
        }
// briefhoofdingen met formele aansprekingen:
        for (var persoon : personen) {
            System.out.println(persoon.maakBriefHoofding((pers) ->
                    "Geachte " + pers.getTitel() + ' '+ pers.getFamilienaam()));
        }

    }
}
