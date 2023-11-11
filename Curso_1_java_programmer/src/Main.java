import herencia.Canguro;
import herencia.Delfin;
import herencia.Mamifero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


        List<Mamifero> mamiferos = new ArrayList<>();
        Delfin delfin = new Delfin(true,"mar","aulamatriz",'m',15,"lo que se atriviece","albino",2);

        delfin.comunicacion();

        Canguro canguro = new Canguro(true,"mar","aulamatriz",'m',15,"herbiboro","rojo",2);
        canguro.comunicacion();

        var canguro2 = canguro;
        canguro2.comunicacion();

        canguro.setTamanoBolsa(2000);

        System.out.println(canguro2.getTamanoBolsa());// JUAN 2000 x2
        System.out.println(canguro.getTamanoBolsa());// JHOAN  2 , 2000 devops , rodrigo
        System.out.println(canguro.toString());
        System.out.println(canguro2.toString());


        mamiferos.add(canguro2);
        mamiferos.add(delfin);

        //mamiferos.get(0) instanceof Canguro ? ((Canguro) mamiferos.get(0)) : null;




        for (Mamifero mamifero: mamiferos) {
            if(mamifero instanceof  Canguro){
                System.out.println("Soy un canguro");
                System.out.println(((Canguro) mamifero).getTamanoBolsa());
            } else if (mamifero instanceof  Delfin) {
                System.out.println("Soy un Delfin");
                System.out.println(((Delfin) mamifero).getTamanoRespiraculo());
            }
        }
        // () -> {};
        // () ->  ;

    }

    public static void  modificarNombre(String lastname){
        lastname = "Suarez";
        System.out.println(lastname);
    }
    public static void  modificarNombre(int age){
        age = 18;
        System.out.println(age);
    }
}