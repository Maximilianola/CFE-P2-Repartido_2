import java.util.Scanner;

public class Ejercicio2_Con_Operador_Ternario {
    static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        int valor = leer.nextInt();

        String mensaje= (valor % 2==0) ? "Es PAR" : "Es IMPAR";
        System.out.println(mensaje);
    }
}