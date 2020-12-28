package creational.abstractfactorypattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactoryRounded.getShape("RECTANGLE");
        Shape shape4 = shapeFactoryRounded.getShape("SQUARE");

        shape3.draw();
        shape4.draw();
    }
}
