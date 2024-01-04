package riddle;

public class Riddle {

    // Atributo
    private int numero;

    // Constructor
    public Riddle() {
        this.numero = (int) (Math.random() * 100);
    }

    // Método para obtener el número
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
      this.numero = numero;
  }
}
