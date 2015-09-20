package _01_Geometry.Shapes.PlaneShapes;

import _01_Geometry.Vertices.TwoDimensionalVertex;

public class Circle extends PlaneShape {
    private double raduis;

    public Circle(TwoDimensionalVertex vertex, double raduis) {
        super(vertex);
        this.raduis = raduis;
    }

    @Override
    public double getArea() {
        double area = Math.PI*this.raduis*this.raduis;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*Math.PI*this.raduis;
        return perimeter;
    }
}
