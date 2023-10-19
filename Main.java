import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       Boolean game_is_on=true;
       while (game_is_on)
       {
           Random rand=new Random();
           int int_random = rand.nextInt(20);
           System.out.println("Hey there! Welcome to the game of Guess\nPlease guesss any number between 1 -20");
           Scanner input=new Scanner(System.in);
           int user_input=input.nextInt();
           if(user_input==int_random)
           {
               System.out.println("Your guesss is right");
               System.out.println("Wanna guess again");
           }
           else {
               System.out.println("Too bad your guess wasn't right");
               System.out.println("Wanna guess again? Y/N");
               String user_guess=input.next();
               if(user_guess.equals("Y"))
               {
                   game_is_on=true;
               }
               else {
                   game_is_on=false;
               }

           }

       }
    }
}