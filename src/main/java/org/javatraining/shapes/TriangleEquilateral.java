package org.javatraining.shapes;

import org.javatraining.CannotFormShape;
import org.javatraining.ICongruentClub;


/**
 * Created by svidrascu on 5/5/2015.
 */

/**
 * "Leaf"
 */
public class TriangleEquilateral extends AbstractTriangle implements ICongruentClub {
    private double side1;

    public TriangleEquilateral(double side1, double side2, double side3) throws CannotFormShape {
        super(side1, side2, side3);
        if (side1 != side2 || side2 != side3) {
            throw new CannotFormShape("This cannot be a equilateral triangle, it doesnt have 3 equal sides");
        }
        this.side1 = side1;
    }

    public String dance() {
        return "Yuhuuuuu <br>";
    }

    public String explode() {
        return "BOOOOOOM !!!<br>";
    }

    public String rotate() {
        return "vrrrrrr !!!<br>";
    }

}
