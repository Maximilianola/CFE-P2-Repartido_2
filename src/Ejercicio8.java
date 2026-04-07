import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("¿Cuantos números POSITIVOS desea sumar?: ");
        int cant = leer.nextInt();
        int suma =0;
        int cont=0;

        if (cant<=0){
            System.out.println("No se realizo ninguna operación.");
        }else {
            while (cant != cont) {
                cont = cont + 1;
                System.out.print("Ingrese número " + cont + ": ");
                suma = suma + leer.nextInt();
            }
        System.out.println();
        System.out.println("La suma total es: " + suma);
        }
    }
}