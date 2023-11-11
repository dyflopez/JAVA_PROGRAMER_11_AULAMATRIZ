package herencia;

public class Delfin extends  Mamifero{

    private double tamanoRespiraculo;

    public Delfin(boolean vivo, String habitad, String especie, char sexo, int edad, String tropofaguia, String colorPiel, double tamanoRespiraculo) {
        super(vivo, habitad, especie, sexo, edad, tropofaguia, colorPiel);
        this.tamanoRespiraculo = tamanoRespiraculo;
    }

    @Override
    public void comunicacion() {
        System.out.println("kikikikikikiki");
    }

    public double getTamanoRespiraculo() {
        return tamanoRespiraculo;
    }

    public void setTamanoRespiraculo(double tamanoRespiraculo) {
        this.tamanoRespiraculo = tamanoRespiraculo;
    }
}
