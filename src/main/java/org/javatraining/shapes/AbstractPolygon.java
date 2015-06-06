package org.javatraining.shapes;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.StringUtils;
import org.javatraining.Computable;
import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.visitor.ShapeElement;
import org.javatraining.visitor.ShapeVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Composite"
 */
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "@shape")
@JsonSubTypes(
        {
                @JsonSubTypes.Type(name="TriangleEquilateral", value = TriangleEquilateral.class),
                @JsonSubTypes.Type(name="Hexagon", value = Hexagon.class),
                @JsonSubTypes.Type(name="Pentagon", value = Pentagon.class),
                @JsonSubTypes.Type(name="Square", value = Square.class)
        })
public abstract class AbstractPolygon implements ShapeElement, Computable {

    private double perimeter;
    private List<Double> poligonSides = new ArrayList<Double>();

    public double getPerimeter() {
        return perimeter;
    }

    public AbstractPolygon(List<Double> sides) throws CannotFormShape {

        for (Double side : sides) {
            if (side < 1) {
                throw new CannotFormShape("Side is below 0 !!!");
            }
        }

        this.poligonSides.addAll(sides);
        this.perimeter = this.calculatePerimeter();

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

    public void serialize(ShapeVisitor visitor) throws CannotFormShape {
        visitor.visit(this);
    }

    final public String cateLaturiAmEuOare() {
        return "Eu am " + poligonSides.size() + " sa traiti !!!";
    }
}
