import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {

        String verificar="";
        Scanner leer = new Scanner(System.in);

        do {
            System.out.print("Ingresa tú contraseña: ");
            verificar = leer.nextLine();

            if (verificar.equals("java123")){
                System.out.println("¡Acceso correcto!");
            }else {
                System.out.println("Contraseña incorrecta.");
            }

        } while (!verificar.equals("java123"));
    }
}