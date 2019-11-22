public class Main {

    public static void main(String[] args) {
//	    boolean gameOver= true;
//	    int score= 800;
//	    int levelCompleted= 5;
//	    int bonus= 100;
//	    if (gameOver){
//	        int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score: "+finalScore);
//        }
//        int highScore= calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your Highscore = "+ highScore);
//        score= 10000;
//        levelCompleted= 8;
//        bonus= 200;
        // we can also pass the direct values inside the arguments
//        highScore= calculateScore(true, 10000, 8, 200);
//        System.out.println("Your Highscore = "+ highScore);

//        --------------------------------------------------------------------
//            Assignment
        // enter PlayerScore value 1500, 900, 400, 50
        int highScore = calculateHighScorePosition(1500);
        DisplayHighScorePosition("Rahul", highScore);
        highScore = calculateHighScorePosition(900);
        DisplayHighScorePosition("Saquib", highScore);
        highScore = calculateHighScorePosition(400);
        DisplayHighScorePosition("Mathews", highScore);
        highScore = calculateHighScorePosition(50);
        DisplayHighScorePosition("Katy", highScore);



    }
    // now to return some value from the method
    // change the void to int
    // and add the return statement at the end of the line of if and after the if statement as -1
    // the -1 value represent the value not found or the error
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }
    public static void DisplayHighScorePosition(String playerName, int position){
        System.out.println(playerName+" manged to get into position "+ position+ " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500 ) {
            return 2;
        }else if(playerScore >= 100){
            return 3;
        }else{
            return 4;
        }
    }
}
