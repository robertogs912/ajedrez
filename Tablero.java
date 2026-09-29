public class Tablero {

    private Casillero[][] casillero;

    public Tablero() {
        casillero = new Casillero[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casillero[i][j] = new Casillero();
                casillero[i][j].setCoordenada((i * 10) + j);

                if ((i + j) % 2 == 0) {
                    casillero[i][j].setColor("Blanco");
                } else {
                    casillero[i][j].setColor("Negro");
                }
            }
        }
    }

    public Casillero getCasillero(int fila, int columna) {
        return casillero[fila][columna];
    }
}