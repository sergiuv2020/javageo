package org.javatraining.shapes;

import org.apache.commons.lang3.StringUtils;
import org.javatraining.CannotFormShape;
import org.javatraining.IComputable;
import org.javatraining.ICongruentClub;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Leaf"
 */
public class Pentagon extends AbstractPolygon implements IComputable, ICongruentClub {

    private double side1;

    public Pentagon(double side1, double side2, double side3, double side4, double side5) throws CannotFormShape {
        super(side1, side2, side3, side4, side5);
        if (side1 != side2 || side2 != side3 || side3 != side4 || side4 != side5) {
            throw new CannotFormShape("This cannot be a pentagon, it doesnt have 5 equal sides");
        }
        this.side1 = side1;
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
