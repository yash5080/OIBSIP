package Number_Guessing_Game;

import java.util.Random;
import java.util.Scanner;

public class guess_the_number {

    public static void main(String[] args) {

        game();

    }

    public static void game(){

        int ans, guess;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("which level you want enter ");
        System.out.println("1) Easy ");
        System.out.println("2) Medium ");
        System.out.println("3) Hard ");
        int level = sc.nextInt();
        switch (level){
            case 1:System.out.println("Guess a Number Between 0 and 10");
                guess = sc.nextInt();
                ans = ran.nextInt(0,10) +1;
                check(guess,ans);
                break;
            case 2:System.out.println("Guess a Number Between 0 and 50");
                guess = sc.nextInt();
                ans = ran.nextInt(0,30) +1;
                check(guess,ans);
                break;
            case 3: System.out.println("Guess a Number Between 0 and 100");
                guess = sc.nextInt();
                ans = ran.nextInt(0,100) +1;
                check(guess,ans);
                break;
            default:System.out.println("Wrong Input");
                game();


        }



    }

    private static void check(int guess,int ans ){
        if(guess == ans){
            System.out.println("Good Job, You are correct !");
            System.out.println("The number is "+ans);
        }else {
            System.out.println("Oops! You have guessed the wrong number");
            System.out.println("The correct number is "+ans);
        }
    }
}
