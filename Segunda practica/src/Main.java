public class Main {
    public static void main(String[] args) {

        int numero = 10;

        //Usando un if, crear una condición que compare
        //si la variable numeroIf es positivo, negativo, o 0.
        if (noEsPositivo(numero)){
            if (numero == 0){
                System.out.println("Es neutro...");
            }
            else{
                System.out.println("Es negativo...");
            }
        }
        else{
                System.out.println("Es positivo...");
        }
        System.out.println(".......................................");

        //Crea un bucle While, este bucle tendrá que tener como condición
        //que la variable numeroWhile sea inferior a 3, el bloque de
        //código que tendrá el bucle deberá:
        numero = 0;
        while (numero < 3){
            numero++;
            System.out.println(numero);
        }

        System.out.println(".......................................");
        //Para el bucle Do While, deberás crear la misma estructura
        //que en el While, pero solo se debe ejecutar una vez.
        numero = 1;
        do {
            numero++;
            System.out.println(numero);
        }while (numero<1);
        System.out.println(".......................................");

        //Para el bucle For, crea una variable numeroFor,
        //esta variable tendrá como valor 0 y su condición
        //será que la variable sea igual o menor que 3,
        //se irá incrementando en 1 su valor
        //cada vez que se ejecute y deberá mostrarse por pantalla.
        for(numero=0; numero <= 3; numero++){
            System.out.println(numero);
        }
        System.out.println(".......................................");
        //Por último, para el Switch, deberás crear la variable
        //estacion, y distintos case para las cuatro estaciones del año.
        //Dependiendo del valor de la variable estacion se deberá
        //mandar un mensaje por consola informando de la estación
        //en la que está. También habrá que poner un default para
        //cuando el valor de la variable no sea una estación.
        String estacion = "Verano";
        switch (estacion){
            case "Primavera": {
                System.out.println("Es Primavera! Mucha alergia...");
                break;
            }
            case "Verano": {
                System.out.println("Es Verano! soy team calor pero con ventilador");
                break;
            }
            case "Otoño": {
                System.out.println("Es Otoño! Oh no... The Winter Is Coming...");
                break;
            }
            case "Invierno": {
                System.out.println("Es Invierno! ACHUUUU..... Estoy resfriado... Te odio invierno...");
                break;
            }
            default:
                System.out.println("No existe dicha estacion...");
        }
    }
    public static boolean noEsPositivo(int a){
        return a <= 0;
    }
}