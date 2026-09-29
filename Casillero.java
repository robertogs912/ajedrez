public class Casillero {
    
    private String color;
    private int coordenada;

    public Casillero() {
    }

    public Casillero(String color, int coordenada){
        this.color = color;
        this.coordenada = coordenada;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getCoordenada(){
        return coordenada;
    }

    public void setCoordenada(int coordenada){
        this.coordenada = coordenada;
    }
}
