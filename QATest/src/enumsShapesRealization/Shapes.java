package enumsShapesRealization;

/*Enum which contains names of figures*/
public enum Shapes {
    CIRCLE("Круг"),
    TRAPEZIUM("Трапеция"),
    TRIANGLE("Треугольник"),
    SQUARE("Квадрат");


    private String shapeName; // class field name of the figure

    Shapes(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

}
