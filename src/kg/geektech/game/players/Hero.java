package kg.geektech.game.players;

import kg.geektech.game.general.AbilityType;
import kg.geektech.game.general.GameEntity;


public abstract class Hero extends GameEntity implements HavingAbility {
    private AbilityType abilityType;

    public Hero(int health, int damage, AbilityType abilityType) {
        super(health, damage);
        this.abilityType = abilityType;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(AbilityType abilityType) {
        this.abilityType = abilityType;
    }

}
