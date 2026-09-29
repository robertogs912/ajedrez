public class Peon extends Pieza {

    public Peon() {
        super();
    }

    public Peon(String color, String velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    @Override
    public void mover() {
        System.out.println("Hola, soy el Peón y puedo moverme una casilla hacia delante.");
    }
}