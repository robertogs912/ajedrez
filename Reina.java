public class Reina extends Pieza {

    public Reina() {
        super();
    }

    public Reina(String color, String velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    @Override
    public void mover() {
        System.out.println("Hola, soy la Reina y puedo moverme en horizontal, vertical y diagonal.");
    }
}
