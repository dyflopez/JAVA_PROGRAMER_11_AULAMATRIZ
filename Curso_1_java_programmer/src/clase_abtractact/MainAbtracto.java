package clase_abtractact;

public class MainAbtracto {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.multiplicacion(2.1,2.4);

        ICalculadoraProfesonal.realizarDerivaba();

        calculator.buscarLimites();
    }
}
