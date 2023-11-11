package lamnda.interfazfuncional;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {

    public static void main(String[] args) {

       // ejemploInterfazSupplier();

        //ejempoPredicate(1000000.60);

        aplciandoInterfacesFuncionales(2000000,90);
    }

    public static void ejemploConsumerImprimir(String mensaje){
        //Consumer<String> imprimir = (a) -> System.out.println(a);
        Consumer<String> imprimirMejorado = System.out::println;

        imprimirMejorado.accept(mensaje);


    }

    public static String ejemploInterfazFunction(String nombre){

       // Function<String,String> upper  = cadena -> cadena.toUpperCase();
        Function<String,String> upper  = String::toUpperCase;
        return upper.apply(nombre);
    }


    public static void ejempoPredicate (double salarioMinimo){
        Predicate<Double> validateSmv = salario -> salario > Constants.slmv;

        if(validateSmv.test(salarioMinimo)){
            ejemploConsumerImprimir(
                    ejemploInterfazFunction("esta persona gana menos del salario minimo ")
            );
        }else{
            ejemploConsumerImprimir(ejemploInterfazFunction("la persona es Multimillonaria"));
        }

    }

    public static void ejemploInterfazSupplier (){
        Supplier<Character> createToken  = () -> {

            char  cadena[]  = Constants.tokenCharacter.toCharArray();
            int posicion =new Random().nextInt(15)+1;
            return cadena[posicion];
        };

        StringBuilder token = new StringBuilder();
        for (int  i = 0; i<10;i++){
            token.append(createToken.get());
        }

        LambdaMain.ejemploConsumerImprimir(token.toString());
    }

    public static void aplciandoInterfacesFuncionales (double salario,int tamano ){
            if(UtilInterfacesFuncionales.validateSmv.test(salario)){
                var token = generateToken(tamano);

                var tokeUpper = UtilInterfacesFuncionales.upper.apply(token);
                UtilInterfacesFuncionales.imprimirMejorado.accept(tokeUpper);
            }else{
                UtilInterfacesFuncionales.imprimirMejorado.accept("no se puede generar el token");
            }
    }

    public static  String generateToken(int size){

        String cadena = "";

        for (int i = 0; i < size; i++) {
            cadena+=UtilInterfacesFuncionales.createToken.get();
        }
        return cadena;
    }
}
