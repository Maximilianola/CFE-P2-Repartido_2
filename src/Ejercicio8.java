import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("¿Cuantos números POSITIVOS desea sumar?: ");
        int cant = leer.nextInt();
        int suma =0;
        int cont=0;
        int aux=0;

        if (cant<=0){
            System.out.println("No se realizo ninguna operación.");
        }else {

            while (cant != cont) {
                cont = cont + 1;
                System.out.print("Ingrese número " + cont + ": ");
                aux = leer.nextInt();

                while (aux<0){
                    System.out.println("No es un número POSITIVO.");
                    System.out.print("Ingrese número " + cont + ": ");
                    aux = leer.nextInt();

                }
                suma=suma+aux;
            }
        System.out.println();
        System.out.println("La suma total es: " + suma);
        }
    }
}