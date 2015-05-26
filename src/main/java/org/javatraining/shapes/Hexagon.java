package org.javatraining.shapes;


import org.apache.commons.lang3.StringUtils;
import org.javatraining.CongruentShape;
import org.javatraining.exceptions.CannotFormShape;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Leaf"
 */
public class Hexagon extends CongruentPolygon {

    public Hexagon(double side) throws CannotFormShape {
        super(side ,6);
    }

    public double calculateArea() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(), "shapes."));
        return 666;
    }

    public String dance() {
        return "Bamboleooooooo bamboleaaaa<br>";
    }

    public String explode() {
        return "BOOOOOOM !!!<br>";
    }

    public String rotate() {
        return "shuuuuup !!!<br>";
    }

}
