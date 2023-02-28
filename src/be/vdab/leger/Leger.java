package be.vdab.leger;

import java.util.ArrayList;
import java.util.List;

public class Leger implements StrijdElement {
    private final List<StrijdElement> strijdElementen = new ArrayList<>();
    void add(StrijdElement strijdElement){strijdElementen.add(strijdElement);};

    @Override
    public void trekTenStrijde() {
        System.out.println("Het leger trekt ten strijde met volgende pelotons:");
        strijdElementen.stream()
                .forEach(strijdElement -> strijdElement.trekTenStrijde());

    }
}
