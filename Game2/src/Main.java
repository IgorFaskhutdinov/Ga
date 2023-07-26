import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя героя:");
        String heroName = scanner.nextLine();

        Hero hero = new Hero(heroName, 150, 15, 7);
        System.out.println("Герой " + hero.getName() + " создан.");

        while (true) {
            System.out.println("Введите команду (атаковать/информация/выход):");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("атаковать")) {
        Monster monster = new Monster(100, 10, 5);


        int experience = 0;
        int gold = 0;

        while (monster.isAlive() && hero.isAlive()) {
            // Ход монстра
            int monsterDamage = monster.attack();
            hero.takeDamage(monsterDamage);
            System.out.println("Монстр атакует героя и наносит " + monsterDamage + " урона");


            if (!hero.isAlive()) {
                System.out.println("Герой погиб");
                break;
            }

            // Ход героя
            int heroDamage = hero.attack();
            monster.takeDamage(heroDamage);
            System.out.println("Герой атакует монстра и наносит " + heroDamage + " урона");

            if (!monster.isAlive()) {
                System.out.println("Монстр погиб");
                experience += monster.getExperience();
                gold += monster.getGold();
                break;
            }
        }

        System.out.println("Герой получает " + experience + " очков опыта и " + gold + " золота");
            }
        }
    }
}