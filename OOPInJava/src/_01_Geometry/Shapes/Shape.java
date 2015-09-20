package _01_Geometry.Shapes;

import _01_Geometry.Vertices.Vertex;

public abstract class Shape {
    private Vertex vertex;

    protected Shape(Vertex vertex) {
        this.vertex = vertex;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }

    @Override
    public String toString() {
        String shapeType = this.getClass().getSimpleName();
        return shapeType;
    }
}
