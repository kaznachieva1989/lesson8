package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, AbilityType.STUN_BOSS);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        int randomNumber = r.nextInt(2);
        if (randomNumber == 0) {
            boss.setDamage(0);
            System.out.println("Босс оглушен");
        } else
            boss.setDamage(30);

    }
}
