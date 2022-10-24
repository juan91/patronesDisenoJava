package PatronFactory.ejemplo1;

public class Main {

    public static void main(String[] arg) {
        System.out.println("okas");
        Factura f = FactoriaFacturas.getFactura("iva");
        f.setId(1);
        f.setImporte(100);
        System.out.println(f.getImporteIva());

        Factura f2 = FactoriaFacturas.getFactura("siniva");
        f2.setId(2);
        f2.setImporte(500);
        System.out.println(f.getImporte());

    }

}
