package pro1p2_víctorromero;

public class Lanzaguisantes extends Plants {

    private int reload;
    private int velocidadDisparo;

    public Lanzaguisantes() {
        super();
    }

    public Lanzaguisantes(int reload, int velocidadDisparo, String name, int sunCost, int health, int attackPower) {
        super(name, sunCost, health, attackPower);
        this.reload = reload;
        this.velocidadDisparo = velocidadDisparo;
    }

    public int getReload() {
        return reload;
    }

    public void setReload(int reload) {
        this.reload = reload;
    }

    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

}
