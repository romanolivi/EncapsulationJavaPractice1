package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.fullName = "Romano Livi";
        player.hitPoints = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.hitPoints = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancePlayer romano = new EnhancePlayer("Romano", 50, "Sword");
        System.out.println("Initial health is " + romano.getHitPoints());
    }
}
