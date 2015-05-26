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
public class Pentagon extends CongruentPolygon {

    public Pentagon(double side) throws CannotFormShape {
        super(side , 5);
    }

    public double calculateArea() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(), "shapes."));
        return 555;
    }

    public String dance() {
        return "Bamboleooooooo bamboleaaaa<br>";
    }

    public String explode() {
        return "BOOOOOOM !!!<br>";
    }

    public String rotate() {
        return "zaaap !!!<br>";
    }
}
