package enumsShapesRealization;

/*Enum of the box that contains the colors of the figures*/
public enum ShapeColor {
    RED("Красный"),
    ORANGE("Оранжевый"),
    YELLOW("Жёлтый"),
    GREEN("Зелёный"),
    BLUE("Голубой"),
    DARK_BLUE("Синий"),
    PURPLE("Фиолетовый");
    private String nameOfColor; // class field name of the color

    ShapeColor(String nameOfColor) {
        this.nameOfColor = nameOfColor;
    }

    public String getNameOfColor() {
        return nameOfColor;
    }
}
