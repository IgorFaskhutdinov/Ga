import java.util.Random;

public class Monster {
    private int health;
    private int strength;
    private int agility;

    public Monster(int health, int strength, int agility) {
        this.health = health;
        this.strength = strength;
        this.agility = agility;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int attack() {
        Random rand = new Random();
        // Вычисление урона в зависимости от силы монстра
        int damage = rand.nextInt(strength) + 1;
        return damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getExperience() {
        return 0;
    }

    public int getGold() {
        return 0;
    }
}

