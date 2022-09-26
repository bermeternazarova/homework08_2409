package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends  Hero{
    private  int savedDamage ;
    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT );
    }
    public  void  setSavedDamage (int savedDamage){
         int randomRevert = RPG_Game.random.nextInt(5)+5;
        System.out.println(randomRevert);
        this.savedDamage = savedDamage/randomRevert;
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setSavedDamage(boss.getDamage());
        boss.setHealth(boss.getHealth()-savedDamage);
        System.out.println("Берсерк вернул " + savedDamage+" урона");


     }
            }






