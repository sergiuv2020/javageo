package org.javatraining.visitor;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.shapes.AbstractPolygon;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public class ShapeSerializer implements ShapeVisitor {

    private double areaCalculation = 0;
    private String sidesNumber = "";
    private double perimeterCalculation = 0;
    private String shapeName = "";

    public void visit(AbstractPolygon polygon) {
        this.setAreaCalculation(polygon.calculateArea());
        this.setPerimeterCalculation(polygon.calculatePerimeter());
        this.setSidesNumber(polygon.cateLaturiAmEuOare());
        this.setShapeName(polygon.getClass().getSimpleName());
    }

    public byte[] generateJsonforShapes(List<AbstractPolygon> shapelist) throws IOException, CannotFormShape {
        ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
        JsonGenerator jsonGenerator = new JsonFactory()
                .createGenerator(bytestream);
        //for pretty printing
        jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());

        jsonGenerator.writeStartObject(); // start root object

        for (AbstractPolygon abstractPolygon : shapelist) {
            visit(abstractPolygon);
            jsonGenerator.writeObjectFieldStart(getShapeName());
            jsonGenerator.writeStringField("NrOfSides", getSidesNumber());
            jsonGenerator.writeNumberField("Perimeter", getPerimeterCalculation());
            jsonGenerator.writeNumberField("Area", getAreaCalculation());
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndObject(); //closing root object

        jsonGenerator.flush();
        jsonGenerator.close();

        return bytestream.toByteArray();
    }


    public double getAreaCalculation() {
        return areaCalculation;
    }

    public void setAreaCalculation(double areaCalculation) {
        this.areaCalculation = areaCalculation;
    }

    public String getSidesNumber() {
        return sidesNumber;
    }

    public void setSidesNumber(String sidesNumber) {
        this.sidesNumber = sidesNumber;
    }

    public double getPerimeterCalculation() {
        return perimeterCalculation;
    }

    public void setPerimeterCalculation(double perimeterCalculation) {
        this.perimeterCalculation = perimeterCalculation;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}

