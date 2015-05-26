package org.javatraining;

/**
 * Created by svidrascu on 5/23/15.
 */

import org.apache.commons.lang3.StringUtils;
import org.javatraining.composite.CongruentShapeComposite;
import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.shapes.*;
import org.javatraining.visitor.ShapeSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HomePage {

    @RequestMapping("/")
    String home() throws CannotFormShape, IOException {
        List<AbstractPolygon> abstractPolygons = new ArrayList<AbstractPolygon>();
        abstractPolygons.add(new Hexagon(2));
        abstractPolygons.add(new Square(7));
        abstractPolygons.add(new Pentagon(5));
        abstractPolygons.add(new TriangleEquilateral(6));

        String text = "";

        for (AbstractPolygon abstractPolygon : abstractPolygons) {
            text = text + StringUtils.substringAfter(abstractPolygon.getClass().toString(), "shapes.") + " " + abstractPolygon.cateLaturiAmEuOare() + "<br>";
        }

        return "<i><b> Cate laturi aveti ?!?! </b></i><br><br>" + text +
                "<br><br> <a href=\"http://localhost:8080/club\"> Vrei sa vezi cum petrec formele ??? </a>" +
                "<br><br> Hai sa vedem si <a href=\"http://localhost:8080/area\"> aria </a>" +
                "sau <a href=\"http://localhost:8080/perimeter\"> perimetrul </a>" +
                "<br><br> <a href=\"http://localhost:8080/shapes.json\"> GIF me magical json file with values !!! </a>";
    }

    /**
     * Client
     */
    @RequestMapping("/club")
    String club() throws CannotFormShape {
        CongruentShape hexagon = new Hexagon(2);
        CongruentShape triunghi = new TriangleEquilateral(6);
        CongruentShape pentagon = new Pentagon(5);
        CongruentShape square = new Square(7);

        CongruentShapeComposite majorParty = new CongruentShapeComposite();
        CongruentShapeComposite party1 = new CongruentShapeComposite();
        CongruentShapeComposite party2 = new CongruentShapeComposite();

        party1.add(triunghi);
        party1.add(hexagon);

        party2.add(pentagon);
        party2.add(square);

        majorParty.add(party1);
        majorParty.add(party2);

        String text = "<b><i> PARTYYYYYYY !!!! </i></b> <br>";


        text = text + " " + majorParty.dance() + "<br>";
        text = text + " " + majorParty.rotate() + "<br>";
        text = text + " " + majorParty.explode() + "<br>";


        return text + "<br><br> <a href=\"http://localhost:8080/\"> Back to the booooooring stuff. </a>";
    }

    @RequestMapping("/area")
    String area() throws CannotFormShape {
        ArrayList<Computable> computables = new ArrayList<Computable>();
        computables.add(new Hexagon(2));
        computables.add(new Pentagon(5));
        computables.add(new TriangleEquilateral(6));
        computables.add(new Square(7));

        String text = "<b><i> PARTYYYYYYY !!!! </i></b> <br>";
        for (Computable computable : computables) {
            text = text + StringUtils.substringAfter(computable.getClass().toString(), "shapes.") + " " + computable.calculateArea() + "<br>";
        }

        return "<i><b> Si aria ?!?! </b></i><br><br>" + text +
                "<br><br> <a href=\"http://localhost:8080/perimeter\"> Hai sa vedem si Perimetrul </a>" +
                "<br><br> <a href=\"http://localhost:8080/\"> Hai napoi acasa... </a>";
    }

    @RequestMapping("/perimeter")
    String perimeter() throws CannotFormShape {
        ArrayList<Computable> computables = new ArrayList<Computable>();
        computables.add(new Hexagon(2));
        computables.add(new Pentagon(5));
        computables.add(new TriangleEquilateral(6));
        computables.add(new Square(7));
        String text = "<b><i> PARTYYYYYYY !!!! </i></b> <br>";
        for (Computable computable : computables) {
            text = text + StringUtils.substringAfter(computable.getClass().toString(), "shapes.") + " " + computable.calculatePerimeter() + "<br>";
        }

        return "<i><b> Si Perimetrul ?!?! </b></i><br><br>" + text +
                "<br><br> <a href=\"http://localhost:8080/area\"> Hai sa vedem si aria </a>" +
                "<br><br> <a href=\"http://localhost:8080/\"> Hai napoi acasa... </a>";
    }

//    @RequestMapping(value = "/files/{file_name}", method = RequestMethod.GET)
//    @ResponseBody
//    public FileSystemResource getFile(@PathVariable("file_name") String fileName) throws CannotFormShape, IOException {
//        return new FileSystemResource(fileName);
//    }

    @RequestMapping(value = "/shapes.json", method = RequestMethod.GET)
    public void getFile(HttpServletResponse response) throws IOException, CannotFormShape {
        List<AbstractPolygon> abstractPolygons = new ArrayList<AbstractPolygon>();
        abstractPolygons.add(new Hexagon(2));
        abstractPolygons.add(new Square(7));
        abstractPolygons.add(new Pentagon(5));
        abstractPolygons.add(new TriangleEquilateral(6));

        ShapeSerializer savedData = new ShapeSerializer();
        byte[] shapeData = savedData.generateJsonforShapes(abstractPolygons);

        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=shapes.json");
        response.getOutputStream().write(shapeData);

        response.flushBuffer();
    }

}
