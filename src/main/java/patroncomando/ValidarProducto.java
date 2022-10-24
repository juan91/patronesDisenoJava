package patroncomando;

public class ValidarProducto implements TareaProducto{

    @Override
    public void run(Producto producto) {
        if (producto.getPrecio() > 100) {
            System.out.println("producto valido");
        } else {
            System.out.println("producto invalido");
        }
    }

}