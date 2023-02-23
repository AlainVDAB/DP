package be.vdab.oef;

public enum Versnellingsbak {
    INSTANCE;
    private int versnelling;

    void hogerSchakelen() {
        if (versnelling < 5) {
            versnelling++;
        }
    }

    void lagerSchakelen() {
        if (versnelling > 0) {
            versnelling--;
        }
    }

    void achteruitSchakelen() {
        if (versnelling == 0) {
            versnelling= -1;
        }
    }

}
