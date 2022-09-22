package PatronFactory;

public class ShapeFactory {

    public Shape getShape(String type) {
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
