package pro1p2_víctorromero;

public class Plants {

    protected String name;
    protected int sunCost;
    protected int health;
    protected int attackPower;

    public Plants() {
    }

    public Plants(String name, int sunCost, int health, int attackPower) {
        this.name = name;
        this.sunCost = sunCost;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSunCost() {
        return sunCost;
    }

    public void setSunCost(int sunCost) {
        this.sunCost = sunCost;
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
        return "Plants{" + "name=" + name + "\n"
                + "sunCost=" + sunCost + "\n"
                + "health=" + health + "\n"
                + "attackPower=" + attackPower + '}';
    }

    public void attackZombie(Zombies zombie) {
        zombie.receiveDamage(this.attackPower);
        System.out.println(this.name + " ha atacado a " + zombie.getName() + " por " + this.attackPower + " puntos de daño.");
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " ha recibido " + damage + " puntos de daño.");
        if (this.health <= 0) {
            System.out.println(this.name + " ha muerto.");
        }
    }
}
