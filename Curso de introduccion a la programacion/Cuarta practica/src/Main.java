public class Main {
    public static void main(String[] args) {

        Cliente unCliente = new Cliente("Eduardo", 26, 1157819443, 1500);

        System.out.println("Nombre: "   +   unCliente.getNombre());
        System.out.println("Edad: "     +   unCliente.getEdad());
        System.out.println("Telefono: " +   unCliente.getTelefono());
        System.out.println("Credito: "  +   unCliente.getCredito());

    }
}

class Persona{
    String nombre;
    int edad;
    int telefono;

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }


}

class Cliente extends Persona{
    double credito;

    public Cliente(String nombre, int edad, int telefono, double credito) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setTelefono(telefono);
        this.setCredito(credito);
    }

    public void setCredito(double credito) {
        this.credito=credito;
    }
    public double getCredito(){
        return this.credito;
    }

class Trabajador extends Persona{

    double salario;

    }
}