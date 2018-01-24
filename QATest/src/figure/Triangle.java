package figure;

import abstractShapeRealization.ShapeAbstrImpl;
import enumsShapesRealization.Shapes;

/*The class figure.Triangle, which implements the methods of the abstractShapeRealization.Shape interface
and accesses the parent class fields abstractShapeRealization.ShapeAbstrImpl*/
public class Triangle extends ShapeAbstrImpl {

    private double cathetusOne; // field cathete one
    private double cathetusTwo; // field cathete two

    /*Constructor that specifies the color of a triangle and the size of its legs*/
    public Triangle(String shapeColor, double cathetusOne, double cathetusTwo) {
        this.cathetusOne = cathetusOne;
        this.cathetusTwo = cathetusTwo;
        super.setShapeName(Shapes.TRIANGLE.getShapeName()); // I access the ShapeName field of the superclass abstractShapeRealization.ShapeAbstrImpl
        super.setShapeColor(shapeColor); // I access the field shapeColor superclass abstractShapeRealization.ShapeAbstrImpl
    }

    /*Print complete information about the triangle for the console*/
    @Override
    public void draw() {
        System.out.println("Фигура: " + super.getShapeName() + ", Площадь: " + getAreaTheShape()
                + ", Гипотенуза: " + getHypotenuseOfTriangle() + ", Цвет: " + super.getShapeColor());
    }

    /*Method for calculating the area of a triangle*/
    @Override
    public double getAreaTheShape() {
        double perimeter = (cathetusOne + cathetusTwo + getHypotenuseOfTriangle())/2;
        return Math.sqrt(perimeter * (perimeter - cathetusOne) * (perimeter - cathetusTwo)
                * (perimeter - getHypotenuseOfTriangle()));
    }

    /*Method for calculating the hypotenuse of a triangle*/
    public double getHypotenuseOfTriangle(){
        return Math.sqrt(cathetusOne * cathetusOne + cathetusTwo * cathetusTwo);
    }

}
