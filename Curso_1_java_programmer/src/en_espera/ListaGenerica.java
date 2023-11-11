
package en_espera;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T>{

    List<T> lista = new ArrayList<>();

    public void agrear(T valor){
        lista.add(valor);
    }

    public T getItem(int index){
       return lista.get(index);
    }
}
