import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Coloque los numeros a continuacion presionando Enter para sumar...");
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);

        int a = entrada1.nextInt();
        int b = entrada2.nextInt();
        int c = entrada3.nextInt();

        int totalSumaDe3 = sumaDe3(a,b,c);
        System.out.println("Resultado es: " + totalSumaDe3);

        Coche miCoche = new Coche();
        miCoche.disminuir_cantidad_puertas();
        miCoche.disminuir_cantidad_puertas();
        miCoche.disminuir_cantidad_puertas();
        miCoche.disminuir_cantidad_puertas();

        System.out.println("Cantidad de puertas restantes: " + miCoche.cantidad_puertas);

    }

    public static int sumaDe3(int a, int b, int c){
        return a+b+c;
    }
    static class Coche{
        public int cantidad_puertas = 4;

        public void disminuir_cantidad_puertas(){
            this.cantidad_puertas--;
        }
    }

}