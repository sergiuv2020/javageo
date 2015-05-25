import org.javatraining.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by MariutaSergiu on 5/4/2015.
 */
public class Tests {


    @Test
    public void testFormuleCalcul() {
        ArrayList<Formule> formule = new ArrayList<Formule>();
        formule.add(new Hexagon());
        formule.add(new Triunghi());
        formule.add(new Pentagon());
        formule.add(new TriunghiEchilateral());

        for (Formule element : formule) {
            element.calculeazaAria();
            element.calculeazaPerimetrul();
        }
    }

    @Test
    public void testPoligoane() {
        ArrayList<Poligoane> poligoane = new ArrayList<Poligoane>();
        poligoane.add(new Hexagon());
        poligoane.add(new Triunghi());
        poligoane.add(new Pentagon());
        poligoane.add(new TriunghiEchilateral());

        for (Poligoane element : poligoane) {
            element.cateLaturiAmEuOare();
        }
    }

    @Test
    public void testParty() {
        ArrayList<ClubulFormelorCongruente> party = new ArrayList<ClubulFormelorCongruente>();
        party.add(new Hexagon());
        party.add(new Patrat());
        party.add(new Pentagon());
        party.add(new TriunghiEchilateral());

        for (ClubulFormelorCongruente element : party) {
            element.dance();
            element.explode();
            element.rotate();
        }
    }
}
