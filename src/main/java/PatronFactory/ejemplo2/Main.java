package PatronFactory.ejemplo2;

import PatronFactory.ejemplo1.Factura;

public class Main {

    public static void main(String[] arg) {
        ShapeFactory shapeFactory = new ShapeFactory();

        ShapeI s = shapeFactory.getShape("C");
        s.message();
        ShapeI s2 = shapeFactory.getShape("R");
        s2.message();

    }

}
