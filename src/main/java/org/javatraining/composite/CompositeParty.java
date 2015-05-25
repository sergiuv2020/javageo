package org.javatraining.composite;

import org.javatraining.ICongruentClub;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public class CompositeParty implements ICongruentClub {
    private List<ICongruentClub> childMembers = new ArrayList<ICongruentClub>();

    public String rotate() {
        String rotate = "";
        for (ICongruentClub childMember : childMembers) {
            rotate = rotate + childMember.rotate();
        }
        return rotate;
    }

    public String explode() {
        String explode = "";
        for (ICongruentClub childMember : childMembers) {
            explode = explode + childMember.explode();
        }
        return explode;
    }

    public String dance() {
        String dancing = "";
        for (ICongruentClub childMember : childMembers) {
            dancing = dancing + childMember.dance();
        }
        return dancing;
    }

    public void add(ICongruentClub clubMember) {
        childMembers.add(clubMember);
    }

    public void remove(ICongruentClub clubMember) {
        childMembers.remove(clubMember);
    }


}
