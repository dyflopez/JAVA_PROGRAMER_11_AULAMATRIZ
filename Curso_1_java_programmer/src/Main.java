import herencia.Canguro;
import herencia.Delfin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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