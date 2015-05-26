package org.javatraining.shapes;

import org.javatraining.CongruentShape;
import org.javatraining.exceptions.CannotFormShape;


/**
 * Created by svidrascu on 5/5/2015.
 */

/**
 * "Leaf"
 */
public class TriangleEquilateral extends AbstractTriangle implements CongruentShape {

    public TriangleEquilateral(double side) throws CannotFormShape {
        super(side, side, side);
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
