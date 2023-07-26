import javax.naming.Name;
import java.util.Random;
public class Hero {
    private int health;
    private int strength;
    private int agility;
    private int experience;
    private int gold;

    public Hero(String heroName, int health, int strength, int agility) {
        this.health = health;
        this.strength = strength;
        this.agility = agility;
        this.experience = 0;
        this.gold = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int attack() {
        Random rand = new Random();
        // Вычисление урона в зависимости от силы героя
        int damage = rand.nextInt(strength) + 1;
        return damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void gainExperience(int experience) {
        this.experience += experience;
    }

    public void gainGold(int gold) {
        this.gold += gold;
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
        return experience;
    }

    public int getGold() {
        return gold;
    }

    public String getName() {
        String Name = new String();
        return Name;
    }
}