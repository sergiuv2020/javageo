package org.javatraining.shapes;

import org.apache.commons.lang3.StringUtils;
import org.javatraining.CongruentShape;
import org.javatraining.exceptions.CannotFormShape;

/**
 * Created by svidrascu on 5/5/2015.
 */

/**
 * "Leaf"
 */
public class Square extends CongruentPolygon {


    public Square(double side) throws CannotFormShape {
        super(side , 4);
    }

    final public double calculateArea() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(), "shapes."));

        double area;
        area = getSide() * getSide();
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
