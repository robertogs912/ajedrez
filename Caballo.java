public class Caballo extends Pieza {

    public Caballo() {
        super();
    }

    public Caballo(String color, String velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    @Override
    public void mover() {
        System.out.println("Hola, soy el Caballo y puedo moverme como una L.");
    }
}