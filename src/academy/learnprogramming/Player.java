package academy.learnprogramming;

public class Player {
    public String fullName;
    public int hitPoints;
    public String weapon;

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player is dead");
        }
    }

    public int healthRemaining() {
        return this.hitPoints;
    }
}
