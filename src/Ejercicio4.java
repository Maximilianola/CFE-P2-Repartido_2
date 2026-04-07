import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Comparación de 3 valores");
        System.out.println();

        System.out.print("Ingrese el primer valor:  ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int num2 = leer.nextInt();
        System.out.print("Ingrese el tercer valor:  ");
        int num3 = leer.nextInt();

        if (num1>num2){
            if (num1>num3){
                System.out.println("El mayor es el valor " + num1);
            }else {
                System.out.println("El mayor es el valor " + num3);
            }
        } else if (num2>num3) {
            System.out.println("El mayor es el valor " + num2);
        }else {
            System.out.println("El mayor es el valor " + num3);
        }
    }
}