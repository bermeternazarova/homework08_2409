package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {
    private static  int roundNumber ;
    public static Random random = new Random();
    public  void  startGame(){
        Boss boss = new Boss(1000 ,50,"TANOS");
        Warrior warrior = new Warrior( 290 , 0, "BAKI" );
        Medic doc = new Medic(250 , 0,15,"STRENGE");
        Magic magic = new Magic(280 ,0, "POTTER" );
        Berserk berserk = new Berserk(270 , 0, "VIKING" );
        Medic assistant = new Medic(260 , 0,5,"STONE");

        Hero[] heroes = {warrior,doc,magic,berserk,assistant};



        printStatistics(boss,heroes);
        while (!isGameFinished(boss,heroes)){
            playRound(boss,heroes);
        }
    }
    private static void playRound (Boss boss, Hero[]heroes){
        roundNumber ++;
        boss.chooseDefence(heroes);
        boss.attack(heroes);
        for (int i = 0; i < heroes.length ; i++) {
            if (heroes[i].getAbility().toString() != boss.getDefence() && heroes[i].getHealth()
            >0){
            heroes[i].attack(boss);
            heroes[i].applySuperPower(boss,heroes);}
        }
        printStatistics(boss,heroes);
    }
    private  static  void  printStatistics (Boss boss, Hero[] heroes){
        System.out.println("Round  " + roundNumber + "________________");
        System.out.println( boss);
        for (int i = 0; i < heroes.length ; i++) {
            System.out.println(heroes[i]);

        }
    }
    private  static  boolean isGameFinished (Boss boss, Hero[]heroes){
        if (boss.getHealth() <=0){
            System.out.println("Heroes won!!!");
            return  true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length ; i++) {
            if (heroes[i].getHealth()>0){
                allHeroesDead= false;
                break;
            }
        }if (allHeroesDead){
            System.out.println( "Boss won !!!");
        }return  allHeroesDead;
    }
}
