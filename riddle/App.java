package riddle;

public class App {
    public static void main(String[] args) {
        App juego = new App();
        juego.jugar();
    }
 
    private void jugar() {
        Riddle adivinanza = new Riddle();
        adivinanza.setNumero((int) (Math.random() * 100));

        int intentos = 0;

        while (intentos < 10) {
            System.out.println("Introduce un número del 1 al 100:");
            int numero = Integer.parseInt(System.console().readLine());

            if (numero == adivinanza.getNumero()) {
                System.out.println("¡Has acertado! El número era " + adivinanza.getNumero());
                break;
            } else if (numero > adivinanza.getNumero()) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("El número es mayor.");
            }

            intentos++;
        }

        if (intentos == 10) {
            System.out.println("Has perdido. El número era " + adivinanza.getNumero());
        }
    }
}

