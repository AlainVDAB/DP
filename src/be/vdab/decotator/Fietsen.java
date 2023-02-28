package be.vdab.decotator;

public class Fietsen extends BungalowDecotator {
    Fietsen(Vakantiepark bungalowMetOpties){
        super(bungalowMetOpties);
    }
    @Override
    public String getTaak() {
        return bungalowMetOpties.getTaak()
                + "\nplaats de fietsen bij de bungalow";
    }
}
