package ua.opnu.model;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

public class RoundedRectangle extends DrawShape {

    public RoundedRectangle() {}

    public RoundedRectangle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    @Override
    public Shape getShape() {
        Rectangle2D.Double bounds = calculateBounds();
        return new RoundRectangle2D.Double(bounds.getX(), bounds.getY(),
                bounds.getWidth(), bounds.getHeight(), 55.0, 55.0);
    }
}