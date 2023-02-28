package be.vdab.observer.oef;

import java.util.HashSet;
import java.util.Set;

public class Fotokopiemachine {
    private final String serienummer;
    private final Set<Observer> observers = new HashSet<>();

    private int onderhoud;

    public Fotokopiemachine(String serienummer) {
        this.serienummer = serienummer;
    }

    public String getSerienummer() {
        return serienummer;
    }

    public int getOnderhoud() {
        return onderhoud;
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }


    void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void MaakKopie(int aantal){
        onderhoud+= aantal;
        if(onderhoud >=10){
            onderhoud=0;
            notifyObservers();
        }
        System.out.println(onderhoud);
    }
}
