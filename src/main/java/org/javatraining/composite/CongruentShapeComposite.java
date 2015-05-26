package org.javatraining.composite;

import org.javatraining.CongruentShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public class CongruentShapeComposite implements CongruentShape {

    private List<CongruentShape> childMembers = new ArrayList<CongruentShape>();

    public String rotate() {
        String rotate = "";
        for (CongruentShape childMember : childMembers) {
            rotate = rotate + childMember.rotate();
        }
        return rotate;
    }

    public String explode() {
        String explode = "";
        for (CongruentShape childMember : childMembers) {
            explode = explode + childMember.explode();
        }
        return explode;
    }

    public String dance() {
        String dancing = "";
        for (CongruentShape childMember : childMembers) {
            dancing = dancing + childMember.dance();
        }
        return dancing;
    }

    public void add(CongruentShape clubMember) {
        childMembers.add(clubMember);
    }

    public void remove(CongruentShape clubMember) {
        childMembers.remove(clubMember);
    }


}
