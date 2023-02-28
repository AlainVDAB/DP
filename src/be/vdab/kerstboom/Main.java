package be.vdab.kerstboom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kerstversiering kerstboom = new Kerstboom();
        var scanner= new Scanner(System.in);

        System.out.println("Met ballen? (j/n)");
        if ("j".equals(scanner.next())){
        kerstboom= new MetBallen(kerstboom);}

        System.out.println("Met slingers? (j/n)");
        if ("j".equals(scanner.next())){
            kerstboom= new MetSlingers(kerstboom);}

        System.out.println("Met lichtjes? (j/n)");
        if ("j".equals(scanner.next())){
            kerstboom= new MetLichtjes(kerstboom);}



        System.out.println(kerstboom.getBeschrijving());
    }
}
