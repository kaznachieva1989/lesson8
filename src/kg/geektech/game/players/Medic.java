package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Medic extends Hero {
    private int heal_points;

    public int getHeal_points() {
        return heal_points;
    }

    public void setHeal_points(int heal_points) {
        this.heal_points = heal_points;
    }

    public Medic(int health, int damage) {
        super(health, damage, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() + heal_points);
        }
    }
}
