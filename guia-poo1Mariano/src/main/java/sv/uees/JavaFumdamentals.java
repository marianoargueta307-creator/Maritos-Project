package sv.uees;
import java.util.Scanner;
public class JavaFumdamentals {

    public static void main(String[] Arg) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ingrse su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.println("\nResultado:");
        System.out.println("tu nombre es" + nombre + " y tu edad es" + edad);

        sc.close();
    }


}


