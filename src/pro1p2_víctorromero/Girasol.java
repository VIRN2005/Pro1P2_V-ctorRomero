package pro1p2_víctorromero;

public class Girasol extends Plants {

    private int produccion;

    public Girasol() {
        super();
    }

    public Girasol(int produccion, String name, int sunCost, int health, int attackPower) {
        super();
        this.produccion = produccion;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }

//    public void generateSun() {
//        // Genera un nuevo sol con la posición de la planta y lo agrega al juego
//        Sun newSun = new Sun(this.getPositionX(), this.getPositionY());
//        Game.getInstance().addSun(newSun);
//    }
}
