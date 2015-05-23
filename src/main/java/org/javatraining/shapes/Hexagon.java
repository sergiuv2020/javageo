package org.javatraining.shapes;


import org.apache.commons.lang3.StringUtils;
import org.javatraining.IComputable;
import org.javatraining.ICongruentClub;

/**
 * Created by svidrascu on 5/4/2015.
 */
public class Hexagon extends AbstractPolygon implements IComputable, ICongruentClub {

    final public String cateLaturiAmEuOare() {
        return "Eu am SHASE sa traiti !!!";
    }

    public Integer calculeazaAria() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(),"javatraining.") );
        return 60;
    }

    public Integer calculeazaPerimetrul() {
        System.out.println("Formula magica pentru calculat perimetrul unui " +
                StringUtils.substringAfter(this.getClass().toString(),"javatraining.") );
        return 6;
    }

    public String dance() {
        return "Bamboleooooooo bamboleaaaa";
    }

    public String explode() {
        return "BOOOOOOM !!!";
    }

    public String rotate() {
        return "BOOOOOM !!!";
    }

    public void metodaSpecificaHexagon() {

    }
}
