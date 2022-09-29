import patronfabricaabstracto.AbstractFactory;
import patronfabricaabstracto.FactoryProducer;
import patronfabricaabstracto.Shape;
import singleton.SingleObject;

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
        /*Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);
        System.out.println(f.getImporteIva());*/

        //******************************************************

        // patron abtract factory
/*        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();*/
        //******************************************************************

        // patron singleton
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        //show the message
        object.showMessage();
    }

}
