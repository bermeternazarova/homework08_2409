package kg.geektech.game.players;

public class Warrior extends Hero{

    public Warrior(int health, int damage ,String name ) {
        super(health, damage, name,SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
