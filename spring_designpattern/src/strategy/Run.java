package strategy;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import strategy.chracter.Beginner;
import strategy.chracter.Monster;
import strategy.chracter.Player;
import strategy.chracter.Warrior;
import strategy.weapon.Gun;
import strategy.weapon.Sword;
import strategy.weapon.Weapon;


public class Run {

    public static void main(String[] args) {
        Player beginner = new Beginner("초보자", 600, 20, 10);
        Player warrior = new Warrior("전사", 600, 20, 10);
        battle(warrior);
    }

    private static void battle(Player player) {
        Scanner sc = new Scanner(System.in);
        Monster monster = new Monster("슬라임", 600, 20, 10);
        System.out.println(monster.getName() + " 두둥 등장.");

        List<Weapon> weapons = List.of(
            new Sword("동검", 10),
            new Sword("철검", 15),
            new Sword("강철검", 20),
            new Gun("소총", 20),
            new Gun("권총", 10)
        );

        while (true) {
            if (player.isDead()) {
                System.out.println("system: 패배 ㅠ__ㅜ");
                break;
            }

            if (monster.isDead()) {
                System.out.println("system: 승리 ദ്ദി ᵔ∇ᵔ )");
                break;
            }

            System.out.println("\n=============================\n");
            sc.nextLine();

            Random random = new Random();
            int itemIdx = random.nextInt(0, 5);
            player.equippedWeapon(weapons.get(itemIdx));

            player.attack(monster);
            monster.attack(player);
        }
    }
}
