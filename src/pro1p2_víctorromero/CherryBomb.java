package pro1p2_víctorromero;

public class CherryBomb extends Plants {

    private int radioExplosion;

    public CherryBomb() {
        super();
    }

    public CherryBomb(int radioExplosion, String name, int sunCost, int health, int attackPower) {
        super(name, sunCost, health, attackPower);
        this.radioExplosion = radioExplosion;
    }

    public int getRadioExplosion() {
        return radioExplosion;
    }

    public void setRadioExplosion(int radioExplosion) {
        this.radioExplosion = radioExplosion;
    }

}
