package Shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle implements Shape {

    private final int x1;
    private final int y1;
    private final int width;
    private final int height;
    private final Color color;
    private final BasicStroke stroke;
    private final Color fillColor;
    private final boolean transparent;
    private final int group = 0;

    public Rectangle(int x1, int y1, int x2, int y2, Color color, BasicStroke stroke, Color fillColor,
            boolean transparent) {
        this.x1 = x1;
        this.y1 = y1;
        width = Math.abs(x2 - x1);
        height = Math.abs(y2 - y1);
        this.color = color;
        this.stroke = stroke;
        this.fillColor = fillColor;
        this.transparent = transparent;
    }

    @Override
    public int getX1() {
        return x1;
    }

    @Override
    public int getY1() {
        return y1;
    }

    @Override
    public int getX2() {
        // Bottom-right corner for drawing
        return x1 + width;
    }

    @Override
    public int getY2() {
        // Bottom-right corner for drawing
        return y1 + height;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public BasicStroke getStroke() {
        return stroke;
    }

    @Override
    public int getGroup() {
        return group;
    }

    @Override
    public void draw(Graphics2D g) {
        if (fillColor != null && !transparent) {
            g.setColor(fillColor);
            g.fillRect(x1, y1, width, height);
        }
        if (color != null) {
            g.setColor(color);
            g.setStroke(stroke);
            g.drawRect(x1, y1, width, height);
        }
    }
}