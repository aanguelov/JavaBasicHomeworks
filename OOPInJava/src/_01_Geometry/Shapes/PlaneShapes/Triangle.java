package _01_Geometry.Shapes.PlaneShapes;

import _01_Geometry.Vertices.TwoDimensionalVertex;
import _01_Geometry.Vertices.Vertex;

public class Triangle extends PlaneShape {
    private Vertex secondVertex;
    private Vertex thirdVertex;

    public Triangle(TwoDimensionalVertex vertex, TwoDimensionalVertex second, TwoDimensionalVertex third) {
        super(vertex);
        this.setSecondVertex(second);
        this.setThirdVertex(third);
    }

    public Vertex getSecondVertex() {
        return secondVertex;
    }

    public void setSecondVertex(Vertex secondVertex) {
        this.secondVertex = secondVertex;
    }

    public Vertex getThirdVertex() {
        return thirdVertex;
    }

    public void setThirdVertex(Vertex thirdVertex) {
        this.thirdVertex = thirdVertex;
    }

    @Override
    public double getArea() {
        double halfPerimeter = this.getPerimeter()/2;
        double sideA = this.getTriangleSide(this.getSecondVertex(), this.getThirdVertex());
        double sideB = this.getTriangleSide(this.getVertex(), this.getThirdVertex());
        double sideC = this.getTriangleSide(this.getVertex(), this.getSecondVertex());
        double area = Math.sqrt(
                halfPerimeter*
                (halfPerimeter - sideA)*
                (halfPerimeter - sideB)*
                (halfPerimeter - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double sideA = this.getTriangleSide(this.getSecondVertex(), this.getThirdVertex());
        double sideB = this.getTriangleSide(this.getVertex(), this.getThirdVertex());
        double sideC = this.getTriangleSide(this.getVertex(), this.getSecondVertex());
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    private double getTriangleSide(Vertex firstVertex, Vertex secondVertex) {
        double side = Math.sqrt(
                (Math.pow((firstVertex.getX() - firstVertex.getY()), 2) +
                (Math.pow((secondVertex.getX() - secondVertex.getY()), 2))));
        return side;
    }
}
