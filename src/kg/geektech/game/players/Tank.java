package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

import java.util.Random;

public class Tank extends Hero {
    private int splitBossDamage;

    public int getSplitBossDamage() {
        return splitBossDamage;
    }

    public void setSplitBossDamage(int splitBossDamage) {
        this.splitBossDamage = splitBossDamage;
    }

    public Tank(int health, int damage) {
        super(health, damage, AbilityType.TAKE_PART_OF_BOSS_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
            Tank.this.setHealth(Tank.this.getHealth() - boss.getDamage() / 2);
        }
}
