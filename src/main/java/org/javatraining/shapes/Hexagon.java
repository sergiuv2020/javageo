package org.javatraining.shapes;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.StringUtils;
import org.javatraining.CongruentShape;
import org.javatraining.exceptions.CannotFormShape;

import java.io.Serializable;

/**
 * Created by svidrascu on 5/4/2015.
 */

/**
 * "Leaf"
 */
//@JsonRootName(value = "Hexagon")
public class Hexagon extends CongruentPolygon implements CongruentShape{
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Hexagon(@JsonProperty("side") double side) throws CannotFormShape {
        super(side ,6);
        this.area = calculateArea();
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
