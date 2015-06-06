package org.javatraining.shapes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.StringUtils;
import org.javatraining.CongruentShape;
import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.visitor.ShapeVisitor;

import java.io.Serializable;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Leaf"
 */

//@JsonRootName(value = "Pentagon")
public class Pentagon extends CongruentPolygon implements CongruentShape{
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;

    }

    public Pentagon(@JsonProperty("side") double side) throws CannotFormShape {
        super(side , 5);
        this.area = calculateArea();
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
