package patroncomando;

public class TareaImprimirProducto  implements TareaProducto{

    @Override
    public void run(Producto producto) {
        System.out.println(producto.getNombre());
        System.out.println(producto.getId());
        System.out.println(producto.getPrecio());
    }

}
