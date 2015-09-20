package _01_Geometry.Shapes.PlaneShapes;

import _01_Geometry.Vertices.TwoDimensionalVertex;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(TwoDimensionalVertex vertex, double width, double height) {
        super(vertex);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = this.getWidth()*this.getHeight();
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*this.getWidth() + 2*this.getHeight();
        return perimeter;
    }
}
