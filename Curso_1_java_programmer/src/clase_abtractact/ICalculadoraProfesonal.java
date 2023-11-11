package clase_abtractact;

public interface ICalculadoraProfesonal {

    default void buscarLimites() {
        System.out.println("Estas derivando");
    }
    void realizarIntegrales();

    static void realizarDerivaba() {
        System.out.println("Estas derivando");
    }


}
