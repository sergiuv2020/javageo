package org.javatraining.shapes;


import com.google.common.collect.Lists;
import org.javatraining.CongruentShape;
import org.javatraining.exceptions.CannotFormShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Leaf"
 */
public abstract class CongruentPolygon extends AbstractPolygon implements CongruentShape {


    private List<Double> sides;

    public CongruentPolygon(double side, double counter) throws CannotFormShape {
        super(createPolygonSides(side, counter));
        if (side <= 0) {
            throw new CannotFormShape("This cannot be a congruent poligon (side must be an positive number)");
        }
        this.sides = createPolygonSides(side, counter);
    }

    protected static List<Double> createPolygonSides(double side, double counter) {
        List<Double> doubles = Lists.newArrayList();
        for (int i = 0; i < counter; i++) {
            doubles.add(side);
        }
        return doubles;
    }

    public List<Double> getSide() {
        return sides;
    }

}