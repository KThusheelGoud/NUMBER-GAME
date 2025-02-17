import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        boolean play=true;
        int wins=0;

        System.out.println("Welcome to the Number Guessing Game!");

        while(play){
            int num=rnd.nextInt(100)+1;
            int tries=5;

            System.out.println("\nI have chosen a number between 1 and 100. Try to guess it!");
            System.out.println("You have "+tries+" attempts.");

            while(tries>0){
                System.out.print("Enter your guess: ");
                int guess=sc.nextInt();

                if(guess==num){
                    System.out.println("Congratulations! You guessed the number correctly.");
                    wins++;
                    break;
                }else if(guess<num){
                    System.out.println("Too low! Try again.");
                }else{
                    System.out.println("Too high! Try again.");
                }

                tries--;
                if(tries>0){
                    System.out.println("Attempts left: "+tries);
                }else{
                    System.out.println("Out of attempts! The number was: "+num);
                }
            }

            System.out.println("Rounds won: "+wins);
            System.out.print("Do you want to play again? (yes/no): ");
            String ans=sc.next().toLowerCase();

            play=ans.equals("yes");
        }

        System.out.println("Thanks for playing! You won "+wins+" rounds.");
        sc.close();
    }
}
