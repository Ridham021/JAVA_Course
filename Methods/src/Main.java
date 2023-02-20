public class Main {
    public static void main(String[] args) {

        int finalscore = calculateScore(true,1400,6,300);
        System.out.println("your score was " + finalscore);

    }

    public static int calculateScore(boolean gameOver, int score , int levelCompleted , int bonus) {


        int finalscore = score;

        if (gameOver) {
            finalscore += (levelCompleted * bonus);
            finalscore += 1000;

        }
        return finalscore;
    }
}