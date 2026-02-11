package sv.uees;
import java.util.Scanner;

public class JavaRepetitiveFlow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números quieres ingresar? ");
        int cantidad = sc.nextInt();

        int suma = 0;
        int i = 0;

        // Bucle para solicitar los números
        while (i < cantidad) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            int num = sc.nextInt(); // FALTABA: Leer el número ingresado
            suma += num; // Operador de asignación compuesto
            i++;
        }

        System.out.println("\nTotal de la suma: " + suma); // CORREGIDO: Faltaba paréntesis de cierre

        // Uso de for para contar regresivamente
        System.out.println("Contar hacia atrás desde " + cantidad);
        for (int j = cantidad; j >= 1; j--) { // CORREGIDO: j >= 1 para incluir el 1
            System.out.println(j);
        } // FALTABA: Llave de cierre del for

        sc.close();
    } // FALTABA: Llave de cierre del main
}