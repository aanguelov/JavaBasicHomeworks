package _01_Geometry.Shapes.SpaceShapes;

import _01_Geometry.Vertices.ThreeDimensionalVertex;

public class Sphere extends SpaceShape{
    private double radius;

    public Sphere(ThreeDimensionalVertex vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = 4*Math.PI*Math.pow(this.radius, 2);
        return area;
    }

    @Override
    public double getVolume() {
        double volume = (4/3)*Math.PI*Math.pow(this.radius, 3);
        return volume;
    }
}
