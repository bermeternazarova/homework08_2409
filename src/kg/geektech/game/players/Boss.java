package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Boss  extends  GameEntity{
    private  SuperAbility defence ;

    public Boss(int health, int damage , String name) {
        super(health, damage , name);
    }

    public  void  chooseDefence( Hero[] heroes){
        int randomIndex = RPG_Game.random.nextInt(heroes.length);
        defence = heroes[randomIndex].getAbility();
    }
    public  void attack (Hero[] heroes){
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].setHealth( heroes[i].getHealth() - this.getDamage());

        }
    }


    public String getDefence() {
        if (this.defence == defence){
            return " No defence";
        }
        return defence.toString();
    }

    @Override
    public String toString() {
        return  "BOSS " +super.toString() + "  defence: " + this.getDefence();
    }
}