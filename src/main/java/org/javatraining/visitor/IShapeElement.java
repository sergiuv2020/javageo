package org.javatraining.visitor;

import org.javatraining.exceptions.CannotFormShape;

/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public interface IShapeElement {
    void serialize(IShapeVisitor visitor) throws CannotFormShape;
}
