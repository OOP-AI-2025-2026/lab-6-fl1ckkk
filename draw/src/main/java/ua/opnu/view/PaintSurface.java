package ua.opnu.view;

import ua.opnu.model.DrawShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class PaintSurface extends JComponent {

    private List<DrawShape> shapes = new ArrayList<>();
    private DrawShape currentShape;
    private int currentShapeType = DrawShape.SHAPE_RECTANGLE;

    public PaintSurface() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                currentShape = DrawShape.newInstance(currentShapeType);
                currentShape.setStartPoint(e.getPoint());
                currentShape.setEndPoint(e.getPoint());
                shapes.add(currentShape);
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (currentShape != null) {
                    currentShape.setEndPoint(e.getPoint());
                    repaint();
                }
                currentShape = null;
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (currentShape != null) {
                    currentShape.setEndPoint(e.getPoint());
                    repaint();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Встановлення білого фону
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, getWidth(), getHeight());

        // Малювання всіх фігур
        g2.setColor(Color.BLUE);
        for (DrawShape shape : shapes) {
            g2.draw(shape.getShape());
        }
    }

    public void setCurrentShapeType(int shapeType) {
        this.currentShapeType = shapeType;
    }

    public void clearShapes() {
        shapes.clear();
        repaint();
    }
}