import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un VALOR: ");
        double num = leer.nextDouble();

        if (num % 2==0){
            System.out.println("El número es PAR");
        }else {
            System.out.println("El número es IMPAR");
        }
    }
}