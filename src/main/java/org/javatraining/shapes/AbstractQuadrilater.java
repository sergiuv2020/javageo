package org.javatraining.shapes;

import org.javatraining.CannotFormShape;

/**
 * Created by svidrascu on 5/4/2015.
 */
public abstract class AbstractQuadrilater extends AbstractPolygon {

    public AbstractQuadrilater(double... sides) throws CannotFormShape {
        super(sides);
    }
}
