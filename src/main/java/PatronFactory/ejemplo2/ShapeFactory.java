package PatronFactory.ejemplo2;

public class ShapeFactory {

    public ShapeI getShape(String type) {
        if(type.equalsIgnoreCase("C")) {
            return new Circle();
        } else if(type.equalsIgnoreCase("R")) {
            return new Rectangle();
        } else if(type.equalsIgnoreCase("S")) {
            return new Square();
        } else {
            return null;
        }
    }

}
