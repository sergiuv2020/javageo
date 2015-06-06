package org.javatraining.shapes;

import org.javatraining.Computable;
import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.visitor.ShapeSerializer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.containsString;


/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public class ComputableTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testCalculateArea() throws Exception {
        Computable square = new Square(7);
        assertThat("Area calculation is not correct", square.calculateArea(), closeTo(49.0, 0.0));

        Computable triunghi = new TriangleEquilateral(6);
        assertThat("Area calculation is not correct", triunghi.calculateArea(), closeTo(15.588457268119896, 0.0));
    }

    @Test
    public void testCalculatePerimeter() throws Exception {
        ArrayList<Computable> computables = new ArrayList<Computable>();
        computables.add(new TriangleEquilateral(6));
        computables.add(new Square(7));
        computables.add(new Pentagon(5));
        computables.add(new Hexagon(2));

        assertThat("Number of sides is not correct", computables.get(0).calculatePerimeter(), closeTo(18.0, 0.0));
        assertThat("Number of sides is not correct", computables.get(1).calculatePerimeter(), closeTo(28.0, 0.0));
        assertThat("Number of sides is not correct", computables.get(2).calculatePerimeter(), closeTo(25.0, 0.0));
        assertThat("Number of sides is not correct", computables.get(3).calculatePerimeter(), closeTo(12.0, 0.0));

    }

    @Test
    public void testCateLaturiAmEuOare() throws Exception {
        TriangleEquilateral triangle = new TriangleEquilateral(6);
        Square square = new Square(7);
        Pentagon pentagon = new Pentagon(5);
        Hexagon hexagon = new Hexagon(2);


        assertThat("Number of sides is not correct", triangle.cateLaturiAmEuOare(), containsString("3"));
        assertThat("Number of sides is not correct", square.cateLaturiAmEuOare(), containsString("4"));
        assertThat("Number of sides is not correct", pentagon.cateLaturiAmEuOare(), containsString("5"));
        assertThat("Number of sides is not correct", hexagon.cateLaturiAmEuOare(), containsString("6"));
    }


    @Test
    public void testTriangleZeroOnSide() throws CannotFormShape {
        thrown.expect(CannotFormShape.class);
        thrown.expectMessage("Side is below 0 !!!");
        AbstractPolygon triangle1 = new Pentagon(0);
    }

    @Test
    public void testTriangleNotAllEqual() throws CannotFormShape {
        thrown.expect(CannotFormShape.class);
        thrown.expectMessage("Side is below 0 !!!");
        AbstractPolygon triangle1 = new Hexagon(0);
    }

    @Test
    public void testTriangleNegativeSide() throws CannotFormShape {
        thrown.expect(CannotFormShape.class);
        thrown.expectMessage("Side is below 0 !!!");
        AbstractPolygon triangle1 = new Square(-6);
    }

//    @Test
//    public void testDeserialize() throws IOException, CannotFormShape {
//        File test = new File("/home/svidrascu/Downloads/input.json");
//        System.out.println(test.toString());
//        ShapeSerializer serializator = new ShapeSerializer();
//
//        System.out.println(serializator.jsonDeserializer(test));
//        System.out.println("magic");
//    }
}