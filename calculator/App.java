package calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Usar try-with-resources para cerrar el Scanner automáticamente
            System.out.print("Introduce el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Introduce el segundo número: ");
            int numero2 = scanner.nextInt();

            // Realizar las operaciones y almacenar los resultados
            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;
            int division = numero1 / numero2;

            // Imprimir los resultados de manera eficiente
            System.out.printf("La suma es: %d%n", suma);
            System.out.printf("La resta es: %d%n", resta);
            System.out.printf("La multiplicación es: %d%n", multiplicacion);
            System.out.printf("La división es: %d%n", division);
        }
    }
}
