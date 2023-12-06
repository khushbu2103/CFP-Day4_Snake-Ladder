package Day4_SnakeAndLadder_PP;

import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Press anything number start the game");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Welcome to snake and ladder game");
        int pl1_Position = 0;

        //Uc-2
        Random random = new Random();
        int pl1_DiceRollNumber = random.nextInt(6);
        System.out.println("Player rolls the dice and get " + pl1_DiceRollNumber + " number");

        //Uc-3
        int pl1_Option = random.nextInt(3);
        switch (pl1_Option)
        {
            case 0:
                System.out.println("No play");
                break;
            case 1:
                pl1_Position = pl1_Position + pl1_DiceRollNumber;
                System.out.println("Ladder");
                break;
            case 2:
                pl1_Position = pl1_Position - pl1_DiceRollNumber;
                System.out.println("Snake");
                break;
        }
        System.out.println("position of player one is: " + pl1_Position);
    }
}
