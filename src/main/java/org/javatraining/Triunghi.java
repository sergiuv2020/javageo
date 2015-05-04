package org.javatraining;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by svidrascu on 5/4/2015.
 */
public class Triunghi extends Poligoane implements Formule {

    final public void cateLaturiAmEuOare() {
        System.out.println("Eu am trei sa traiti !!!");
    }

    public Integer calculeazaAria() {
        System.out.println("Formula magica pentru calculat aria unui " +
                StringUtils.substringAfter(this.getClass().toString(), "javatraining.") );
        return 60;
    }

    public Integer calculeazaPerimetrul() {
        System.out.println("Formula magica pentru calculat perimetrul unui " +
                StringUtils.substringAfter(this.getClass().toString(),"javatraining.") );
        return 6;
    }

    public void metodaSpecificaTriunghi() {

    }
}
