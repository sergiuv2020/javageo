package org.javatraining.shapes;

import org.javatraining.exceptions.CannotFormShape;

import java.util.List;

/**
 * Created by svidrascu on 5/4/2015.
 */
public abstract class AbstractQuadrilater extends AbstractPolygon {

    public AbstractQuadrilater(List<Double> sides) throws CannotFormShape {
        super(sides);
    }

}
