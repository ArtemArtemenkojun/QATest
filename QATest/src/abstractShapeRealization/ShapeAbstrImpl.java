package abstractShapeRealization;

/*Abstract class in which the class name fields of the shape and color are declared
and which implements abstractShapeRealization.Shape interface methods*/
public abstract class ShapeAbstrImpl implements Shape{

    private String shapeName; // field name of the figure
    private String shapeColor; // field color shapes

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
}
