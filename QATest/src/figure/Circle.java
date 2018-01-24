package figure;
import abstractShapeRealization.ShapeAbstrImpl;
import enumsShapesRealization.Shapes;

/*The class figure.Circle that implements abstractShapeRealization.Shape interface methods and accesses
  to the parent class fields abstractShapeRealization.ShapeAbstrImpl*/
public class Circle extends ShapeAbstrImpl {

    private double diameter; // field circle diameter

    /*Сonstructor that specifies the color and diameter of a circle*/
    public Circle(String shapeColor, double diameter) {
        this.diameter = diameter;
        super.setShapeName(Shapes.CIRCLE.getShapeName()); // I access the ShapeName field of the superclass abstractShapeRealization.ShapeAbstrImpl
        super.setShapeColor(shapeColor); // I go to the superclass's shapeColor field abstractShapeRealization.ShapeAbstrImpl
    }

    /*Print complete information about the circle for the console*/
    @Override
    public void draw() {
        System.out.println("Фигура: " + super.getShapeName() + ", Площадь: " + getAreaTheShape() + ", Радиус: " + getRadius()
        + ", Цвет: " + getShapeColor());
    }

    /*Method for calculating the area*/
    @Override
    public double getAreaTheShape() {
        return (getRadius() * getRadius()) * 3.14;
    }

    /*Method for calculating the radius of a circle*/
    public double getRadius(){
        return diameter/2;
    }

}
