public class Alfil extends Pieza {

    public Alfil() {
        super();
    }

    public Alfil(String color, String velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    @Override
    public void mover() {
        System.out.println("Hola, soy el Alfil y puedo moverme en diagonal.");
    }
}