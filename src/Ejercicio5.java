import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double peso=0;
        double altura=0;

        while (peso<=0){
            System.out.print("Ingrese su peso (kg):  ");
            peso = leer.nextDouble();

            if (peso <= 0) {
                System.out.println("Verifique el valor ingresado");
            }
        }

        while (altura<=0){
            System.out.print("Ingrese su altura (m): ");
            altura = leer.nextDouble();

            if (altura <= 0) {
                System.out.println("Verifique el valor ingresado");
            }
        }

        System.out.println();

        double imc = (peso/Math.pow(altura, 2));
        System.out.printf("Su IMC es  %.2f%s", imc, ". ");

        if (imc<0 || imc>45) {
            System.out.print("Rango no tenido en cuenta para clasificación. VISITE URGENTEMENTE A SU MÉDICO");
        } else if (imc>0 && imc<18){
            System.out.print("Bajo peso.");
        } else if (imc>=18 && imc<25) {
            System.out.print("Peso normal.");
        } else if (imc>=25 && imc<30) {
            System.out.print("Exceso de peso.");
        } else if (imc>=30 && imc<35) {
            System.out.print("Obesidad Grado 1.");
        } else if (imc>=35 && imc<40) {
            System.out.print("Obesidad grado 2.");
        } else if (imc>=40 && imc<45) {
            System.out.print("Obesidad grado 3.");
        }
    }
}