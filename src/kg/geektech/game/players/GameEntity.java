package kg.geektech.game.players;

public abstract class GameEntity {
    private  int health ;
    private  int damage ;
    private  String name ;



    public GameEntity(int health , int damage , String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        if (health<0){
            this.health=0;
        }else {
        this.health = health;
    }}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  this.getName() +" Health: "+ this.getHealth()+" damage: "+ this.getDamage();
    }


}
