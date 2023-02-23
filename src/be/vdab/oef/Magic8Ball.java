package be.vdab.oef;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public enum Magic8Ball {
    INSTANCE;
    private final List<String> antwoorden = Arrays.asList("Zoals ik het zie, ja.", " Het is zeker.", " Hoogst waarschijnlijk.", " Ziet er goed uit.", " Zonder twijfel.", " Ja.", " Zeker.", " Je mag er op rekenen.", " Vraag dit later nog eens.", " Dit wil je niet weten.", " Ik kan dit nu niet voorspellen.", " Concentreer je en stel je vraag opnieuw.", " Je moet er niet op rekenen.", " Nee.", " Ziet er niet goed uit.", " Zeer twijfelachtig.");
    private int vorigeIndex=-1;

    private void antwoord() {
        var huidigeIndex = randomIndex();
        while (huidigeIndex==vorigeIndex){
            huidigeIndex = randomIndex();
        }
        System.out.println(antwoorden.get(huidigeIndex));
        vorigeIndex=huidigeIndex;
    }

    void vraag(){
        var scanner = new Scanner(System.in);
        System.out.println("typ jouw vraag (typ \"Stop\" om te stoppen)");
        var vraag = scanner.nextLine();;
        while (!vraag.equals("Stop")) {
            antwoord();
            //System.out.println(vraag);
            System.out.println("\ntyp jouw vraag (typ \"Stop\" om te stoppen)");
            vraag = scanner.nextLine();;
        }

    }

    ;

    private int randomIndex() {
        return (int) (Math.random() * 16);
    }
}
