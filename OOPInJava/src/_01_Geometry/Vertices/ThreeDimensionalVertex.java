package _01_Geometry.Vertices;

import _01_Geometry.Vertices.Vertex;

public class ThreeDimensionalVertex extends Vertex {
    private double z;

    public ThreeDimensionalVertex(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
