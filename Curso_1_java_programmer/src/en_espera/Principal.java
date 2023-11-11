package en_espera;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<String> nombre = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        List<Double> decimales = new ArrayList<>();
        List<Colegios> colegiosList = new ArrayList<>();

        nombre.add("daniel");
        nombre.add("yesid");
        nombre.add("florez");
        nombre.add("lopez");

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        decimales.add(1.2);
        decimales.add(2.4);
        decimales.add(3.9);


        colegiosList.add( new Colegios("ICCL","Norte"));


        nombre.forEach(System.out::println);
        numeros.forEach(System.out::println);
        decimales.forEach(System.out::println);
        colegiosList.forEach(System.out::println);


    }
}
