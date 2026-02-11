package sv.uees;
import java.util.Scanner;
public class JavaBasicConditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese un numero entero");
        int numero = sc.nextInt();

        // operador y expresion
        boolean esPar = (numero % 2 == 0);

        // control del flujo - condicional
        if (esPar) {
            System.out.println("el umero" + numero + "es par");
        } else {
            System.out.println("el numero" + numero + "es impar");
            sc.close();
        }

    }}