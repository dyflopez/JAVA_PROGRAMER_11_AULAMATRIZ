package clase_abtractact;

public class Calculator extends  CalculadoraAbstract{
    @Override
    int suma(int a, int b) {
        return  a+b;
    }

    @Override
    double multiplicacion(double a, double b) {
        return  a*b*2;
    }

    @Override
    public double factorial(int valor) {
        return 0;
    }

    @Override
    public void sen() {

    }

    @Override
    public void realizarIntegrales() {

    }
}
