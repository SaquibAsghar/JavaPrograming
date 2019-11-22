public class Main {

    public static void main(String[] args) {

        if (3 == 3.0) {
            System.out.println("njkndcn");
        }
        boolean gameOver = true;
        int score = 1100;
        int levelCompleted = 5;
        int bonus = 100;
//    if(score <5000 && score > 1000){
//        System.out.println("Your score was less than 5000 but greater than 1000");
//    }
//    else if (score < 1000){
//        System.out.println("Your score was less tah 1000");
//    }
//    else{
//        System.out.println("Got here");
//    }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
        // concept of codeblock

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }


    }
}
