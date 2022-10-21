public class Main {
    public static void main(String[] args) {

        Persona eduardo = new Persona( "Eduardo", 26, 1157819443);
        Persona alfredo = new Persona();

        alfredo.setNombre("Alfredo");
        alfredo.setEdad(24);
        alfredo.setTelefono(1199999999);

        Persona personas[] = {eduardo, alfredo};

        for (int i=0; i<2; i++){
            if(i==0){
                System.out.println("Datos de la primera persona...");
            }
            else{
                System.out.println("Datos de la segunda persona...");
            }
            System.out.println("Nombre: "   +   personas[i].getNombre());
            System.out.println("Edad: "     +   personas[i].getEdad());
            System.out.println("Telefono: " +   personas[i].getTelefono());
            System.out.println("------------------------------------------------------------");
        }

        //No era parte del enunciado el array, pero lo quise implementar para asi demostrar
        //lo aprendido en clase usando mas herramientas e implementando   

    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public Persona(String nombre, int edad, int telefono){
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setTelefono(telefono);
    }
    public Persona() {}

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }


}