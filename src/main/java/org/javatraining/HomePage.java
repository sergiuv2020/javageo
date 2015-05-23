package org.javatraining;

/**
 * Created by svidrascu on 5/23/15.
 */

import org.apache.commons.lang3.StringUtils;
import org.javatraining.shapes.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class HomePage {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HomePage.class, args);
    }

    @RequestMapping("/")
    String home() {
        ArrayList<AbstractPolygon> abstractPolygons = new ArrayList<AbstractPolygon>();
        abstractPolygons.add(new Hexagon());
        abstractPolygons.add(new Triangle());
        abstractPolygons.add(new Pentagon());
        abstractPolygons.add(new TriangleEquilateral());

        String text = "";

        for (AbstractPolygon abstractPolygon : abstractPolygons) {
            text = text + StringUtils.substringAfter(abstractPolygon.getClass().toString(), "javatraining.") + " " + abstractPolygon.cateLaturiAmEuOare() + "<br>";
        }

        return "<i><b> This is where the magic happens !! </b></i><br><br>" + text + "<br><br> <a href=\"http://localhost:8080/club\"> Vrei sa vezi cum petrec formele ??? </a>";
    }

    @RequestMapping("/club")
    String club() {
        ArrayList<ICongruentClub> clubMembers = new ArrayList<ICongruentClub>();
        clubMembers.add(new Hexagon());
        clubMembers.add(new Square());
        clubMembers.add(new Pentagon());
        clubMembers.add(new TriangleEquilateral());

        String text = "<b><i> PARTYYYYYYY !!!! </i></b> <br>";

        for (ICongruentClub clubMember : clubMembers) {
            text = text + StringUtils.substringAfter(clubMember.getClass().toString(), "javatraining.") + " " + clubMember.dance() + "<br>";
            text = text +
                    StringUtils.substringAfter(clubMember.getClass().toString(), "javatraining.") +
                    " " + clubMember.rotate() + "<br>";
            text = text +
                    StringUtils.substringAfter(clubMember.getClass().toString(), "javatraining.") +
                    " " + clubMember.explode() + "<br>";
        }

        return text + "<br><br> <a href=\"http://localhost:8080/\"> Back to the booooooring stuff. </a>";
    }
}
