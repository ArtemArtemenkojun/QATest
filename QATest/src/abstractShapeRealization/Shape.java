package abstractShapeRealization;

/*The figure interface implements the basic methods for figures*/
public interface Shape {
    void draw(); // method that prints everything about a shape
    double getAreaTheShape(); // method that calculates the area of a shape
    String getShapeColor(); // method that returns the color of a shape
}
