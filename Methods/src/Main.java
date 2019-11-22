public class Main {

    public static void main(String[] args) {
	    boolean gameOver= true;
	    int score= 800;
	    int levelCompleted= 5;
	    int bonus= 100;
//	    if (gameOver){
//	        int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score: "+finalScore);
//        }
        calculateScore(gameOver, score, levelCompleted, bonus);
        score= 10000;
        levelCompleted= 8;
        bonus= 200;
        // we can also pass the direct values inside the arguments
        calculateScore(true, 10000, 8, 200);

    }
    // now to return some value from the method
    // change the void to int
    // and add the return statement at the end of the line of if and after the if statement as -1
    // the -1 value represent the value not found or the error
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score: "+finalScore);
            return finalScore;
        }
        return -1;
    }
}
