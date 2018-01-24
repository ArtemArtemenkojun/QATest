package figure;

import abstractShapeRealization.ShapeAbstrImpl;
import enumsShapesRealization.Shapes;

/*The class figure.Square that implements abstractShapeRealization.Shape interface methods
 and accesses the parent class fields abstractShapeRealization.ShapeAbstrImpl*/
public class Square extends ShapeAbstrImpl {

    private double squareSideSize; // square side size field

    /*Constructor that specifies the color of the square and the size of the side*/
    public Square(String squareColor, int squareSideSize) {
        this.squareSideSize = squareSideSize;
        super.setShapeName(Shapes.SQUARE.getShapeName()); // I access the ShapeName field of the superclass abstractShapeRealization.ShapeAbstrImpl
        super.setShapeColor(squareColor); // I access the field shapeColor superclass abstractShapeRealization.ShapeAbstrImpl
    }

    /*Print complete information about the console square*/
    @Override
    public void draw() {
        System.out.println("Фигура: " + super.getShapeName() + ", Площадь: " + getAreaTheShape() +
                ", Диагональ: " + getDiagonalSizeOfSquare() + ", Цвет: " + super.getShapeColor());
    }

    /*Method for calculating the square of a square*/
    @Override
    public double getAreaTheShape() {
        return squareSideSize*squareSideSize;
    }

    /*Method for calculating the diagonal of a square*/
    public double getDiagonalSizeOfSquare(){
        return Math.sqrt(2) * squareSideSize;
    }

}
