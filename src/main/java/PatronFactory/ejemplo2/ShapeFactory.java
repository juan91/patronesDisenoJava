package PatronFactory.ejemplo2;

public class ShapeFactory {

    public ShapeI getShape(String type) {
        if(type.equals("C")) {
            return new Circle();
        } else if(type.equals("R")) {
            return new Rectangle();
        } else if(type.equals("S")) {
            return new Square();
        } else {
            return null;
        }
    }

}
