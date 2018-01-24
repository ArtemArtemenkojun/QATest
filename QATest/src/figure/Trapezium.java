package figure;

import abstractShapeRealization.ShapeAbstrImpl;
import enumsShapesRealization.Shapes;

/*The class figure.Trapezium, which implements the methods of the abstractShapeRealization.Shape interface
and accesses the parent class fields abstractShapeRealization.ShapeAbstrImpl*/
public class Trapezium extends ShapeAbstrImpl {

    private double topSide; // class field on the top
    private double bottomSide; // class field bottom side
    private double leftSide; // class field left side
    private double rightSide; // class field right side

    /*Constructor that sets the color of the trapezoid and the dimensions of the sides*/
    public Trapezium(String shapeColor, double topSide, double bottomSide, double leftSide, double rightSide) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        super.setShapeName(Shapes.TRAPEZIUM.getShapeName()); // I access the ShapeName field of the superclass abstractShapeRealization.ShapeAbstrImpl
        super.setShapeColor(shapeColor); // I access the field shapeColor superclass abstractShapeRealization.ShapeAbstrImpl
    }

    /*Print full information about the trapeze on the console*/
    @Override
    public void draw() {
        System.out.println("Фигура: " + super.getShapeName() + ", Площадь: " + getAreaTheShape() + ", Высота: "
                + getHeightTrapezium() + ", Цвет: " + super.getShapeColor());
    }

    /*Method for calculating trapezium area*/
    @Override
    public double getAreaTheShape() {
        double m = topSide - bottomSide;
        if(m < 0) m *= -1;
        double formula = (topSide + leftSide + rightSide - bottomSide) *
                (topSide + rightSide - bottomSide - leftSide) *
                (topSide + leftSide - bottomSide - rightSide) *
                (bottomSide + leftSide + rightSide - topSide);
        if (formula < 0) formula *= -1;
        return ((topSide + bottomSide) / (4 * (m))) * Math.sqrt(formula);
    }

    /*Method for calculating trapezium heights*/
    public double getHeightTrapezium(){
        return getAreaTheShape() / ((topSide + bottomSide) / 2);
    }
}
