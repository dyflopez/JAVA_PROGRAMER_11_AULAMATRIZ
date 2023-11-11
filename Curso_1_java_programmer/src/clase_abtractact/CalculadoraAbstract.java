package clase_abtractact;

public abstract class CalculadoraAbstract implements  ICalculadora{

    abstract int suma(int a  , int b);

    double multiplicacion(double a , double b){
        return a *b;
    }

    final double division(double a , double b){
        return a *b;
    }
}