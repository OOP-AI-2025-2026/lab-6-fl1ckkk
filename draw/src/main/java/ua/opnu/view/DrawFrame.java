package ua.opnu.view;

import ua.opnu.model.DrawShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawFrame extends JFrame {

    private PaintSurface paintSurface;
    private int currentShapeType = DrawShape.SHAPE_RECTANGLE;

    public DrawFrame(String title) {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        paintSurface = new PaintSurface();

        // Створення панелі кнопок
        JPanel buttonPanel = new JPanel();

        // Створення кнопок
        JButton rectButton = new JButton("Прямокутник");
        JButton roundedRectButton = new JButton("Овал");
        JButton ellipseButton = new JButton("Еліпс");
        JButton clearButton = new JButton("Очистити");

        // Додавання обробників подій
        rectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShapeType = DrawShape.SHAPE_RECTANGLE;
                paintSurface.setCurrentShapeType(currentShapeType);
            }
        });

        roundedRectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShapeType = DrawShape.SHAPE_ROUNDED_RECT;
                paintSurface.setCurrentShapeType(currentShapeType);
            }
        });

        ellipseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentShapeType = DrawShape.SHAPE_ELLIPSE;
                paintSurface.setCurrentShapeType(currentShapeType);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paintSurface.clearShapes();
            }
        });

        // Додавання кнопок на панель
        buttonPanel.add(rectButton);
        buttonPanel.add(roundedRectButton);
        buttonPanel.add(ellipseButton);
        buttonPanel.add(clearButton);

        // Додавання компонентів на головне вікно
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(paintSurface, BorderLayout.CENTER);

        setVisible(true);
    }
}