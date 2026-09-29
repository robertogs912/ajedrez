public class Torre extends Pieza {

    public Torre() {
        super();
    }

    public Torre(String color, String velocidad, String comportamiento, String movimiento) {
        super(color, velocidad, comportamiento, movimiento);
    }

    @Override
    public void mover() {
        System.out.println("Hola soy la Torre y puedo moverme tanto en horizontal como vertical.");
    }
}