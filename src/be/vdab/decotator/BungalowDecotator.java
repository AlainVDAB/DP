package be.vdab.decotator;

abstract class BungalowDecotator implements Vakantiepark{
    protected final Vakantiepark bungalowMetOpties;

    BungalowDecotator(Vakantiepark bungalow){
        this.bungalowMetOpties=bungalow;
    }
}
