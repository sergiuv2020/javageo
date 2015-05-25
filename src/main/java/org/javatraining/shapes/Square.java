package org.javatraining.shapes;

import org.apache.commons.lang3.StringUtils;
import org.javatraining.ICongruentClub;
import org.javatraining.exceptions.CannotFormShape;

/**
 * Created by svidrascu on 5/5/2015.
 */

/**
 * "Leaf"
 */
public class Square extends AbstractQuadrilater implements ICongruentClub {

    private double side1;

    public Square(double side1, double side2, double side3, double side4) throws CannotFormShape {
        super(side1, side2, side3, side4);
        if (side1 != side2 || side2 != side3 || side3 != side4) {
            throw new CannotFormShape("This cannot be a square, it doesnt have 4 equal sides");
        }
        this.side1 = side1;
    }

    final public double calculateArea() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(), "shapes."));
        double area;
        area = side1 * side1;
        return area;
    }

    public String dance() {
        return "put your points up !!<br>";
    }

    public String explode() {
        return "BOOOOOOM !!!<br>";
    }

    public String rotate() {
        return "zuuuup !!!<br>";
    }

}
