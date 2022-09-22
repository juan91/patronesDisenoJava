import PatronFactory.Shape;
import PatronFactory.ShapeFactory;
import patronfactory2.FactoriaFacturas;
import patronfactory2.Factura;

public class Main {


    public static void main(String[] arg) {
        // Patron factory
        /*var shapeFactory = new ShapeFactory();
        Shape shape1 =  shapeFactory.getShape("C");
        shape1.message();
        Shape shape2 = shapeFactory.getShape("S");
        shape2.message();
        Shape shape3 = shapeFactory.getShape("R");
        shape3.message();*/

        // patron factory ejemplo 2
        Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);
        System.out.println(f.getImporteIva());

    }

}
