package org.javatraining.shapes;

import org.javatraining.ICongruentClub;

/**
 * Created by svidrascu on 5/5/2015.
 */
public class TriangleEquilateral extends Triangle implements ICongruentClub {

    public Integer calculeazaAria() {
        super.calculeazaAria();
        System.out.println("Aria mea e mai smechera ! ");
        return 40;
    }

    public String dance() {
        return "Yuhuuuuu";
    }

    public String explode() {
        return "BOOOOOOM !!!";
    }

    public String rotate() {
        return "vrrrrrr !!!";
    }

    public void metodaSpecificaTriunghiEchilateral() {

    }
}
