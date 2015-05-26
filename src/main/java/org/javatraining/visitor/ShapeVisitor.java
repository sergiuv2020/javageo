package org.javatraining.visitor;

import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.shapes.AbstractPolygon;

/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public interface ShapeVisitor {
    void visit(AbstractPolygon polygon) throws CannotFormShape;
}
