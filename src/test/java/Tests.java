import org.javatraining.IComputable;
import org.javatraining.ICongruentClub;
import org.javatraining.shapes.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by MariutaSergiu on 5/4/2015.
 */
public class Tests {

    @Test
    public void testFormuleCalcul() {
        ArrayList<IComputable> IComputable = new ArrayList<IComputable>();
        IComputable.add(new Hexagon());
        IComputable.add(new Triangle());
        IComputable.add(new Pentagon());
        IComputable.add(new TriangleEquilateral());

        for (IComputable element : IComputable) {
            element.calculeazaAria();
            element.calculeazaPerimetrul();
        }
    }

    @Test
    public void testPoligoane() {
        ArrayList<AbstractPolygon> abstractPolygon = new ArrayList<AbstractPolygon>();
        abstractPolygon.add(new Hexagon());
        abstractPolygon.add(new Triangle());
        abstractPolygon.add(new Pentagon());
        abstractPolygon.add(new TriangleEquilateral());

        for (AbstractPolygon element : abstractPolygon) {
            element.cateLaturiAmEuOare();
        }
    }

    @Test
    public void testParty() {
        ArrayList<ICongruentClub> party = new ArrayList<ICongruentClub>();
        party.add(new Hexagon());
        party.add(new Square());
        party.add(new Pentagon());
        party.add(new TriangleEquilateral());

        for (ICongruentClub element : party) {
            element.dance();
            element.explode();
            element.rotate();
        }
    }
}
