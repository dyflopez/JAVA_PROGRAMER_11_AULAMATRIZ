
package clases_anidadas;

public class ClaseInternaPersona {

    private  String nombre;



    public void mostrarPersona(){
        System.out.println(nombre);
    }

    public void imprimirEmplado(){
        Empleado empleado = new Empleado();
        empleado.impimirTexto();
    }
    public class Empleado{

        private  String cargo;
       public void impimirTexto(){
           System.out.println("cosa" + nombre);
       }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
