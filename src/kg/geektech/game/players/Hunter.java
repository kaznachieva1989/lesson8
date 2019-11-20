package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        int min = 2;
        int max = 4;
        int range = min + (int) (Math.random() * max);

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() * range);
        }
    }
}
