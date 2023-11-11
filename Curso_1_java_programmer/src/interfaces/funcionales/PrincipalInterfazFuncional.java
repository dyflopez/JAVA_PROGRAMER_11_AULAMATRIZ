package interfaces.funcionales;

public class PrincipalInterfazFuncional {

    public static void main(String[] args) {
        ICalculadoraFuncional.ejemploShow();
        ICalculadoraFuncional suma = (a,b) -> a+b;
        ICalculadoraFuncional resta = (a,b) -> a-b;

        var resultado = suma.operacion(5,7);
        System.out.println(resultado);

        //var resultadoResta = resta.operacion(5,7);
        //System.out.println(resultadoResta);
        resta.mostrarMensaje(""+resta.operacion(5,7));

    }
}
