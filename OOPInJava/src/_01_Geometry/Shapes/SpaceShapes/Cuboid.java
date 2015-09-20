package _01_Geometry.Shapes.SpaceShapes;

import _01_Geometry.Vertices.ThreeDimensionalVertex;

public class Cuboid extends SpaceShape{
    private double width;
    private double height;
    private double depth;

    public Cuboid(ThreeDimensionalVertex vertex, double width, double height, double depth) {
        super(vertex);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        double area = 2*this.width*this.height + 2*this.width*this.depth + 2*this.height*this.depth;
        return area;
    }

    @Override
    public double getVolume() {
        double volume = this.width*this.height*this.depth;
        return volume;
    }
}
