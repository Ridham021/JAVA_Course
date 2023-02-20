public class Main {
    public static void main(String[] args) {

        int ans = calculateScore("Ridham",68);
        System.out.println("Your runs are "+ans);
        int unnamedScore = calculateScore(55);
        System.out.println("Unname Player scored "+unnamedScore+" runs");
    }

    public static int calculateScore(String playerName , int score){
        System.out.println("Player" + playerName + " scored "+score+" runs");
        return score*1000;


    }

    public static int calculateScore( int score){
        System.out.println("Unname Player scored "+score+" runs");
        return score*1000;

    }
}