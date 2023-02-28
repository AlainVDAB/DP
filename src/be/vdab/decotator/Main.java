package be.vdab.decotator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vakantiepark bungalow = new Bungalow();
        var scanner = new Scanner(System.in);

        System.out.println("Wenst u een barbeque? (j/n)");
        if("j".equals(scanner.next())){
        bungalow = new Barbecue(bungalow);}

        System.out.println("Wenst u fietsen? (j/n)");
        if("j".equals(scanner.next())){

        bungalow = new Fietsen(bungalow);}

        System.out.println(bungalow.getTaak());
    }

}
