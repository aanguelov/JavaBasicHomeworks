package _01_Geometry;

import _01_Geometry.Contracts.VolumeMeasurable;
import _01_Geometry.Shapes.PlaneShapes.Circle;
import _01_Geometry.Shapes.PlaneShapes.PlaneShape;
import _01_Geometry.Shapes.PlaneShapes.Rectangle;
import _01_Geometry.Shapes.PlaneShapes.Triangle;
import _01_Geometry.Shapes.Shape;
import _01_Geometry.Shapes.SpaceShapes.Cuboid;
import _01_Geometry.Shapes.SpaceShapes.Sphere;
import _01_Geometry.Shapes.SpaceShapes.SquarePyramid;
import _01_Geometry.Vertices.ThreeDimensionalVertex;
import _01_Geometry.Vertices.TwoDimensionalVertex;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GeometryMain {
    public static void main(String[] args) {
        Shape squarePyramid = new SquarePyramid(new ThreeDimensionalVertex(1, 2, 3), 4, 6);
        Shape circle = new Circle(new TwoDimensionalVertex(2.3, 3.4), 5);
        Shape rectangle = new Rectangle(new TwoDimensionalVertex(8, 9.5), 2, 3);
        Shape triangle = new Triangle(
                new TwoDimensionalVertex(1, 2),
                new TwoDimensionalVertex(2, 5),
                new TwoDimensionalVertex(5, 4));
        Shape cuboid = new Cuboid(new ThreeDimensionalVertex(4, 6, 8), 6, 9, 1);
        Shape sphere = new Sphere(new ThreeDimensionalVertex(5.5, 6.8, 4.33), 8.8);

        Shape[] shapes = new Shape[6];
        shapes[0] = squarePyramid;
        shapes[1] = circle;
        shapes[2] = rectangle;
        shapes[3] = triangle;
        shapes[4] = cuboid;
        shapes[5] = sphere;

//        for (Shape shape : shapes) {
//            System.out.println(shape);
//            System.out.println();
//        }

        Arrays.stream(shapes)
                .filter(shape -> shape instanceof VolumeMeasurable)
                .map(shape -> ((VolumeMeasurable) shape))
                .filter(shape -> shape.getVolume() > 40)
                .forEach(shape -> System.out.println(shape));
        System.out.println();

        Comparator<PlaneShape> descending = Collections.reverseOrder(Comparator.comparing(PlaneShape::getPerimeter));
        
        Arrays.stream(shapes)
                .filter(shape -> shape instanceof PlaneShape)
                .map(shape -> ((PlaneShape) shape))
                .sorted(Comparator.comparing(PlaneShape::getPerimeter)) //ascending
                //.sorted(descending)
                .forEach(shape -> System.out.println(shape));

    }
}
