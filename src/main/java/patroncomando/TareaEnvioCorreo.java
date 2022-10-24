package patroncomando;

public class TareaEnvioCorreo implements TareaProducto  {

    @Override
    public void run(Producto producto) {
        System.out.println(producto.getNombre() +" enviado por correo") ;
    }


}