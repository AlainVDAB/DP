package be.vdab.decotator;

public class Barbecue extends BungalowDecotator{

    Barbecue(Vakantiepark bungalowMetOpties){
        super(bungalowMetOpties);
    }
    @Override
    public String getTaak() {
        return bungalowMetOpties.getTaak()
                + "\nplaats een barbecue bij de bungalow";
    }
}
