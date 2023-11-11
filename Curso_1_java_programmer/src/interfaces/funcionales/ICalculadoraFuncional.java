package interfaces.funcionales;

@FunctionalInterface
public interface ICalculadoraFuncional {

    int operacion(int a, int b);

    default void mostrarMensaje(String menaje){
        System.out.println(menaje);
    }

    static void ejemploShow(){
        System.out.println("hola mundo");
    }
}
