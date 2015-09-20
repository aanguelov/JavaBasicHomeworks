package _01_Geometry.Shapes.PlaneShapes;

import _01_Geometry.Contracts.AreaMeasurable;
import _01_Geometry.Contracts.PerimeterMeasurable;
import _01_Geometry.Shapes.Shape;
import _01_Geometry.Vertices.TwoDimensionalVertex;
import _01_Geometry.Vertices.Vertex;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable{

    protected PlaneShape(TwoDimensionalVertex vertex) {
        super(vertex);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        String coordinates = String.format("Coordinates: [x = %.2f; y = %.2f]",
                this.getVertex().getX(),
                this.getVertex().getY());
        String area = String.format("Area: %.2f", this.getArea());
        String perimeter = String.format("Perimeter: %.2f", this.getPerimeter());
        return super.toString() + "\r\n" + coordinates + "\r\n" + area + "; " + perimeter;
    }
}
