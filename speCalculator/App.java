package speCalculator;

import java.util.Scanner;

public class App {

    public static double raizCuadrada(int n) {
        return Math.sqrt(n);
    }

    public static double potencia(int n, int p) {
        return Math.pow(n, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int n = sc.nextInt();

        System.out.println("¿Qué desea calcular?");
        System.out.println("1. Raíz cuadrada");
        System.out.println("2. Potencia");
        int opcion = sc.nextInt();
  
        switch (opcion) {
            case 1:
                System.out.println("La raíz cuadrada de " + n + " es " + raizCuadrada(n));
                break; 
            case 2: 
                System.out.println("Ingrese la potencia:");
                int p = sc.nextInt(); 
                System.out.println(n + " elevado a la " + p + " es " + potencia(n, p));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        } 
    } 
} 