package org.javatraining.shapes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.StringUtils;
import org.javatraining.CongruentShape;
import org.javatraining.exceptions.CannotFormShape;

/**
 * Created by svidrascu on 5/5/2015.
 */

/**
 * "Leaf"
 */

//@JsonRootName(value = "Square")
public class Square extends CongruentPolygon  implements CongruentShape{

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;

    }
    public Square(@JsonProperty("side") double side) throws CannotFormShape {
        super(side , 4);
        this.area=calculateArea();
    }

    final public double calculateArea() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(), "shapes."));
        double side = super.getSide().get(0);
        double area = side * side;
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
