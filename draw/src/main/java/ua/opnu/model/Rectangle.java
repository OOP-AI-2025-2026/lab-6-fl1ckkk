package ua.opnu.model;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends DrawShape {

    public Rectangle() {
    }

    public Rectangle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    @Override
    public Shape getShape() {
        Rectangle2D.Double bounds = calculateBounds();
        return new Rectangle2D.Double(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
    }
}