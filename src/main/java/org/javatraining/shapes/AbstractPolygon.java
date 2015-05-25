package org.javatraining.shapes;


import org.apache.commons.lang3.StringUtils;
import org.javatraining.IComputable;
import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.visitor.IShapeElement;
import org.javatraining.visitor.IShapeVisitor;

import java.util.ArrayList;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Composite"
 */
public abstract class AbstractPolygon implements IShapeElement, IComputable {


    private ArrayList<Double> poligonSides = new ArrayList<Double>();

    public AbstractPolygon(double... sides) throws CannotFormShape {
        for (Double side : sides) {
            if (side < 1) {
                throw new CannotFormShape("Side is below 0 !!!");
            } else
                this.poligonSides.add(side);
        }
        double perimeter = this.calculatePerimeter();
        for (Double poligonSide : poligonSides) {
            if (poligonSide > perimeter - poligonSide) {
                throw new CannotFormShape("No side should be bigger than the sum of the other sides !!!");
            }
        }

    }


    final public double calculatePerimeter() {
        System.out.println("Formula magica pentru calculat perimetrul unui " +
                StringUtils.substringAfter(this.getClass().toString(), "javatraining."));
        double rezultat = 0;
        for (double poligonSide : poligonSides) {
            rezultat = rezultat + poligonSide;
        }
        return rezultat;
    }

    public double calculateArea() {
        return 0;
    }

    public void serialize(IShapeVisitor visitor) throws CannotFormShape {
        visitor.visit(this);
    }

    final public String cateLaturiAmEuOare() {
        return "Eu am " + poligonSides.size() + " sa traiti !!!";
    }
}
