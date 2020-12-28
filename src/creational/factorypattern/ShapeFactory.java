package creational.factorypattern;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        }

        if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        }

        if (shapeType.equals("SQUARE")) {
            return new Circle();
        }

        return null;
    }
}
