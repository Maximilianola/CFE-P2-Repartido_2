import java.util.Scanner;

void main(String[] args) {
    System.out.print("Ingrese un número: ");
    Scanner leer = new Scanner(System.in);

    double Num = leer.nextDouble();

    if (Num <0){
        System.out.println("El número ingresado es NEGATIVO");
    } else if (Num>0) {
        System.out.println("El número ingresado es POSITIVO");
    }else{
        System.out.println("El número ingresado es NEUTRO");
    }
}