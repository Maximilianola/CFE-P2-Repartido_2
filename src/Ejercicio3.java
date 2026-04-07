import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entre 0 y 999: ");

        int num = leer.nextInt();
        System.out.println();

        if (num>=0 && num<=999) {
            System.out.println("El numero " + num + " tiene " + String.valueOf(num).length() + " cifras.");
        }else {
            System.out.println("El número ingresado no cumple con las restricciones.");
        }
    }
}