package lamnda.interfazfuncional;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UtilInterfacesFuncionales {

    public static Consumer<String> imprimirMejorado = System.out::println;

    public static Predicate<Double> validateSmv = salario -> salario > Constants.slmv;
    /*public static Predicate<String,String> validateToken =
                (tokenSystema,tokenUsuario) -> tokenSystema.equalsIgnoreCase(tokenUsuario);*/

    public static Supplier<Character> createToken  = () -> {

        char  cadena[]  = Constants.tokenCharacter.toCharArray();
        int posicion =new Random().nextInt(15)+1;
        return cadena[posicion];
    };

    public static Function<String,String> upper  = String::toUpperCase;
}
