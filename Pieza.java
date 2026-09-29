public class Pieza {

    private String color;
    private String velocidad;
    private String comportamiento;
    private String movimiento;

    public Pieza(String color, String velocidad, String comportamiento, String movimiento){

        this.color = color;
        this.velocidad = velocidad;
        this.comportamiento = comportamiento;
        this.movimiento = movimiento;
    }

    public Pieza() {}
    
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(String velocidad){
        this.velocidad = velocidad;
    }

    public String getComportamiento(){
        return comportamiento;
    }

    public void setComportamiento(String comportamiento){
        this.comportamiento = comportamiento;
    }

    public String getMovimiento(){
        return movimiento;
    }

    public void setMovimiento(String movimiento){
        this.movimiento = movimiento;
    }
    
    public void mover() {
    System.out.println("Soy una pieza y me puedo mover.");
    }
}