package pro1p2_víctorromero;

public class Nuez extends Plants {

    private int resistencia;

    public Nuez() {
        super();
    }

    public Nuez(int resistencia, String name, int sunCost, int health, int attackPower) {
        super(name, sunCost, health, attackPower);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    
//    @Override
//    public void receiveDamage(int damage) {
//        int remainingHealth = this.getHealth() - damage / resistencia;
//        this.setHealth(Math.max(0, remainingHealth));
//        if (this.getHealth() == 0) {
//            this.die();
//        }
//    }
}
