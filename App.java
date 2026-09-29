public class App {
    public static void main(String[] args) {

        Tablero tablero = new Tablero();

        Peon[] peonBlanco = new Peon[8];
        Peon[] peonNegro = new Peon[8];
        Alfil[] alfilBlanco = new Alfil[2];
        Alfil[] alfilNegro = new Alfil[2];
        Caballo[] caballoBlanco = new Caballo[2];
        Caballo[] caballoNegro = new Caballo[2];
        Torre[] torreBlanca = new Torre[2];
        Torre[] torreNegra = new Torre[2];

        Reina reinaBlanca = new Reina("Blanco", "Siete", "Encarnizada", "Armada");
        Reina reinaNegra = new Reina("Negro", "Siete", "Encarnizada", "Armada");
        Rey reyBlanco = new Rey("Blanco", "Uno", "Tenue", "Postrero");
        Rey reyNegro = new Rey("Negro", "Uno", "Tenue", "Postrero");

        for (int i = 0; i < peonBlanco.length; i++) {
            peonBlanco[i] = new Peon("Blanco", "Uno", "Agresor", "Ladino");
        }

        for (int i = 0; i < peonNegro.length; i++) {
            peonNegro[i] = new Peon("Negro", "Uno", "Agresor", "Ladino");
        }

        for (int i = 0; i < alfilBlanco.length; i++) {
            alfilBlanco[i] = new Alfil("Blanco", "Siete", "Sesgo", "Oblicuo");
            alfilNegro[i] = new Alfil("Negro", "Siete", "Sesgo", "Oblicuo");
            caballoBlanco[i] = new Caballo("Blanco", "Una y Dos", "Ligero", "Salto en L");
            caballoNegro[i] = new Caballo("Negro", "Una y Dos", "Ligero", "Salto en L");
            torreBlanca[i] = new Torre("Blanco", "Siete", "Homérica", "Directa");
            torreNegra[i] = new Torre("Negro", "Siete", "Homérica", "Directa");
        }

        // Impresión de todas las piezas blancas
        System.out.println("--- Piezas Blancas ---");
        imprimirPieza(reyBlanco);
        imprimirPieza(reinaBlanca);
        for (int i = 0; i < torreBlanca.length; i++) imprimirPieza(torreBlanca[i]);
        for (int i = 0; i < alfilBlanco.length; i++) imprimirPieza(alfilBlanco[i]);
        for (int i = 0; i < caballoBlanco.length; i++) imprimirPieza(caballoBlanco[i]);
        for (int i = 0; i < peonBlanco.length; i++) imprimirPieza(peonBlanco[i]);

        // Impresión de todas las piezas negras
        System.out.println("--- Piezas Negras ---");
        imprimirPieza(reyNegro);
        imprimirPieza(reinaNegra);
        for (int i = 0; i < torreNegra.length; i++) imprimirPieza(torreNegra[i]);
        for (int i = 0; i < alfilNegro.length; i++) imprimirPieza(alfilNegro[i]);
        for (int i = 0; i < caballoNegro.length; i++) imprimirPieza(caballoNegro[i]);
        for (int i = 0; i < peonNegro.length; i++) imprimirPieza(peonNegro[i]);

        // Polimorfismo: cada pieza se mueve a su manera
        System.out.println("--- Movimientos ---");
        reyBlanco.mover();
        reinaBlanca.mover();
        reyNegro.mover();
        reinaNegra.mover();

        for (int i = 0; i < peonBlanco.length; i++) {
            peonBlanco[i].mover();
        }

        for (int i = 0; i < peonNegro.length; i++) {
            peonNegro[i].mover();
        }

        for (int i = 0; i < 2; i++) {
            alfilBlanco[i].mover();
            caballoBlanco[i].mover();
            torreBlanca[i].mover();
        }

        for (int i = 0; i < 2; i++) {
            alfilNegro[i].mover();
            caballoNegro[i].mover();
            torreNegra[i].mover();
        }
    }

    public static void imprimirPieza(Pieza pieza) {
        System.out.println("Color: " + pieza.getColor()
                + " | Velocidad: " + pieza.getVelocidad()
                + " | Comportamiento: " + pieza.getComportamiento()
                + " | Movimiento: " + pieza.getMovimiento());
    }
}