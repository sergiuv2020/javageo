package org.javatraining.shapes;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.javatraining.exceptions.CannotFormShape;

/**
 * Created by svidrascu on 5/4/2015.
 */
public abstract class AbstractTriangle extends AbstractPolygon {
    private double side3;
    private double side1;
    private double side2;

    public AbstractTriangle(double side1, double side2, double side3) throws CannotFormShape {
        super(Lists.newArrayList(side1, side2, side3));
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }




}
