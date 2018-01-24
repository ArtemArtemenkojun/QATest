import abstractShapeRealization.Shape;
import enumsShapesRealization.ShapeColor;
import figure.Circle;
import figure.Square;
import figure.Trapezium;
import figure.Triangle;

/*The class randomly displays a random list of shapes, their color, flatness, and unique methods,
for each figure their own*/
public class Application {
    public static void main(String[] args) {

        /*Create an array of shapes with a random number of cells*/
        Shape[] shapes = new Shape[getRandomNumber(1, 100)];

        /*Filling the cells of the array with random shapes*/
        for (Shape shape : shapes){
            shape = getRandomShape();
            shape.draw();
        }

    }

    /*Method for obtaining a random number with a range from min to max*/
    private static int getRandomNumber(int min, int max){
        return (int) (min + (Math.random() * (max - min) + 1));
    }

    /*The method of obtaining a random form by obtaining a random number from 1 to 4
    and selecting the appropriate option:*/
    private static Shape getRandomShape(){
        Shape randomShape = null; // initialize variable randomShape

        switch (getRandomNumber(1,4)){
            case 1:{
                randomShape = new Circle(getRandomColor(),getRandomNumber(1,100));
                break;
            }
            case 2:{
                randomShape = new Trapezium(getRandomColor(),getRandomNumber(1, 100), getRandomNumber(1, 100),
                        getRandomNumber(1, 100), getRandomNumber(1, 100));
                break;
            }
            case 3:{
                randomShape = new Triangle(getRandomColor(), getRandomNumber(1, 100), getRandomNumber(1, 100));
                break;
            }
            case 4:{
                randomShape = new Square(getRandomColor(), getRandomNumber(1, 100));
                break;
            }
        }
        return randomShape;
    }

    /*The method of obtaining a random color of 7 colors by obtaining a random number from 1 to 7:*/
    private static String getRandomColor(){
        String randomColor = null;
        switch (getRandomNumber(1,7)){
            case 1:{
                randomColor = ShapeColor.BLUE.getNameOfColor();
                break;
            }
            case 2:{
                randomColor = ShapeColor.GREEN.getNameOfColor();
                break;
            }
            case 3:{
                randomColor = ShapeColor.DARK_BLUE.getNameOfColor();
                break;
            }
            case 4:{
                randomColor = ShapeColor.PURPLE.getNameOfColor();
                break;
            }
            case 5:{
                randomColor = ShapeColor.ORANGE.getNameOfColor();
                break;
            }
            case 6:{
                randomColor = ShapeColor.YELLOW.getNameOfColor();
                break;
            }
            case 7:{
                randomColor = ShapeColor.RED.getNameOfColor();
                break;
            }
        }
        return randomColor;

    }

}
