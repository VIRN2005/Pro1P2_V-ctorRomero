package pro1p2_víctorromero;

public class Zombies {

    private String name;
    private int health;
    private int attackPower;

    public Zombies() {
    }

    public Zombies(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return "Zombies{" + "name=" + name + "\n"
                + "health=" + health + "\n"
                + "attackPower=" + attackPower + '}';
    }

    public void attackPlant(Plants plant) {
        plant.setHealth(plant.getHealth() - this.attackPower);
        System.out.println(this.name + " ha atacado a " + plant.getName() + " por " + this.attackPower + " puntos de daño.");
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " ha recibido " + damage + " puntos de daño");
        if (this.health <= 0) {
            System.out.println(this.name + " ha muerto.");
        }
    }
}
