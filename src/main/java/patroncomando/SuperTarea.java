package patroncomando;

import java.util.ArrayList;
import java.util.List;

public class SuperTarea implements TareaProducto {

    private List<TareaProducto> lista= new ArrayList<>();

    public void addTarea(TareaProducto tarea) {
        lista.add(tarea);
    }
    @Override
    public void run(Producto producto) {

        lista.forEach((t)->t.run(producto));;


    }

}
