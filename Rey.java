public class Rey extends Pieza {

    public Rey() {
        super();
    }

    public Rey(String color, String velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    @Override
    public void mover() {
        System.out.println("Hola, soy el Rey y puedo moverme una casilla por vez.");
    }
}