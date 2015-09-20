package _01_Geometry.Shapes.SpaceShapes;

import _01_Geometry.Vertices.ThreeDimensionalVertex;

public class SquarePyramid extends SpaceShape{
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(ThreeDimensionalVertex vertex, double baseWidth, double pyramidHeight) {
        super(vertex);
        this.setBaseWidth(baseWidth);
        this.setPyramidHeight(pyramidHeight);
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public double getPyramidHeight() {
        return pyramidHeight;
    }

    public void setPyramidHeight(double pyramidHeight) {
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public double getArea() {
        double halfBase = this.getBaseWidth()/2;
        double hypotenuse = Math.sqrt(Math.pow(halfBase, 2) + Math.pow(this.getPyramidHeight(), 2));
        double area = Math.pow(this.getBaseWidth(), 2) + 0.5*this.getBaseWidth()*4*hypotenuse;
        return area;
    }

    @Override
    public double getVolume() {
        double volume = (Math.pow(this.getBaseWidth(), 2)*this.getPyramidHeight())/3;
        return volume;
    }
}
