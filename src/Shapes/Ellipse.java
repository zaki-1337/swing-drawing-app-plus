package Shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Ellipse implements Shape {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final Color color;
    private final BasicStroke stroke;
    private final Color fillColor;
    private final boolean transparent;
    private final int group = 0;

    public Ellipse(int x1, int y1, int x2, int y2, Color color, BasicStroke stroke, Color fillColor,
            boolean transparent) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.stroke = stroke;
        this.fillColor = fillColor;
        this.transparent = transparent;
    }

    @Override
    public int getX1() {
        return x1; // Top-left corner for drawing
    }

    @Override
    public int getY1() {
        return y1;
    }

    @Override
    public int getX2() {
        return x2; // Bottom-right corner for drawing
    }

    @Override
    public int getY2() {
        return y2;
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
    public boolean isPointInside(int xD, int yD) {
        // TODO
        return false;
    }

    @Override
    public void draw(Graphics2D g) {
        if (fillColor != null && !transparent) {
            g.setColor(fillColor);
            g.fillOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
        if (color != null) {
            g.setColor(color);
            g.setStroke(stroke);
            g.drawOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        }
    }
}
