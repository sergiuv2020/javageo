package org.javatraining.shapes;

import org.javatraining.IComputable;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.containsString;


/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public class IComputableTest {

    @Test
    public void testCalculateArea() throws Exception {
        IComputable square = new Square(7, 7, 7, 7);
        assertThat("Area calculation is not correct", square.calculateArea(), closeTo(49.0, 0.0));

        IComputable triunghi = new TriangleEquilateral(6, 6, 6);
        assertThat("Area calculation is not correct", triunghi.calculateArea(), closeTo(15.588457268119896, 0.0));
    }

    @Test
    public void testCalculatePerimeter() throws Exception {
        ArrayList<IComputable> computables = new ArrayList<IComputable>();
        computables.add(new TriangleEquilateral(6, 6, 6));
        computables.add(new Square(7, 7, 7, 7));
        computables.add(new Pentagon(5, 5, 5, 5, 5));
        computables.add(new Hexagon(2, 2, 2, 2, 2, 2));

        assertThat("Number of sides is not correct", computables.get(0).calculatePerimeter(), closeTo(18.0, 0.0));
        assertThat("Number of sides is not correct", computables.get(1).calculatePerimeter(), closeTo(28.0, 0.0));
        assertThat("Number of sides is not correct", computables.get(2).calculatePerimeter(), closeTo(25.0, 0.0));
        assertThat("Number of sides is not correct", computables.get(3).calculatePerimeter(), closeTo(12.0, 0.0));


    }

    @Test
    public void testCateLaturiAmEuOare() throws Exception {
        TriangleEquilateral triangle = new TriangleEquilateral(6, 6, 6);
        Square square = new Square(7, 7, 7, 7);
        Pentagon pentagon = new Pentagon(5, 5, 5, 5, 5);
        Hexagon hexagon = new Hexagon(2, 2, 2, 2, 2, 2);


        assertThat("Number of sides is not correct", triangle.cateLaturiAmEuOare(), containsString("3"));
        assertThat("Number of sides is not correct", square.cateLaturiAmEuOare(), containsString("4"));
        assertThat("Number of sides is not correct", pentagon.cateLaturiAmEuOare(), containsString("5"));
        assertThat("Number of sides is not correct", hexagon.cateLaturiAmEuOare(), containsString("6"));


    }
}