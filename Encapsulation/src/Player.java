public class Player{
    private String name;
    private int health;
    private String weapon;

    public void loseHealth(int damage)
    {
        health -= damage;
        if(health <= 0){
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if (health >= 100){
            System.out.println("Player restored 100%");
            health = 100;
        }
    }
}
