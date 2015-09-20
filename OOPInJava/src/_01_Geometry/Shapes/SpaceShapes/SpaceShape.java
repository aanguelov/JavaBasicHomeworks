package _01_Geometry.Shapes.SpaceShapes;

import _01_Geometry.Contracts.AreaMeasurable;
import _01_Geometry.Contracts.VolumeMeasurable;
import _01_Geometry.Shapes.Shape;
import _01_Geometry.Vertices.ThreeDimensionalVertex;
import _01_Geometry.Vertices.Vertex;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable{
    private ThreeDimensionalVertex vertex;

    protected SpaceShape(ThreeDimensionalVertex vertex) {
        super(vertex);
        this.setVertex(vertex);
    }

    @Override
    public ThreeDimensionalVertex getVertex() {
        return vertex;
    }

    public void setVertex(ThreeDimensionalVertex vertex) {
        this.vertex = vertex;
    }

    public abstract double getArea();

    public abstract double getVolume();

    @Override
    public String toString() {
        String coordinates = String.format("[x = %.2f; y = %.2f; z = %.2f]",
                this.getVertex().getX(),
                this.getVertex().getY(),
                this.getVertex().getZ());
        String area = String.format("%.2f", this.getArea());
        String volume = String.format("%.2f", this.getVolume());
        return super.toString() + "\r\n" + "Coordinates: " + coordinates + "\r\n" + "Area: " + area + "; Volume: " + volume;
    }
}
