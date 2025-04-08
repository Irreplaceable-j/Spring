package strategy.weapon;

public class Gun implements Weapon{

    private String name;
    private int atk;

    public Gun(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }

    @Override
    public int calcWeaponWeight(int damage) {
        return damage + atk * 3;
    }

    @Override
    public void attack() {
        System.out.println(name + "를 사용합니다. 3연발 피스톨~!~!");
    }

    @Override
    public String getName() {
        return name;
    }
}
