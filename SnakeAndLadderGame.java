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
        int pl2_Position = 0;
        int pl1_numberOfDiceRoll = 0;
        int pl2_numberOfDiceRoll = 0;
        int turn = 1;
        Random random = new Random();
        while (turn == 1 || turn == 2 )
        {
            System.out.println("==================");
            int pl1_DiceRollNumber = random.nextInt(6);
            int pl2_DiceRollNumber = random.nextInt(6);
            if(turn == 1)
            {
                pl1_numberOfDiceRoll++;
                System.out.println("Player 1 rolls the dice and get " + pl1_DiceRollNumber + " number");
                int pl1_Option = random.nextInt(3);// 0,1,2
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
                if(pl1_Position < 0)
                {
                    pl1_Position = 0;
                }
                else if (pl1_Position > 100)
                {
                    pl1_Position = 100;
                }
                System.out.println("position of player 1 is: " + pl1_Position);

                if(pl1_Position == 100)
                {
                    turn = 0;
                    System.out.println("player 1 has won after " + pl1_numberOfDiceRoll + " rolls");
                }
                else
                {
                    if (pl1_Option != 1)
                    {
                        turn = 2;
                    }
                }
            }

            else if(turn == 2)
            {
                pl2_numberOfDiceRoll++;
                System.out.println("Player 2 rolls the dice and get " + pl1_DiceRollNumber + " number");
                int pl2_Option = random.nextInt(3);// 0,1,2
                switch (pl2_Option)
                {
                    case 0:
                        System.out.println("No play");
                        break;
                    case 1:
                        pl2_Position = pl2_Position + pl2_DiceRollNumber;
                        System.out.println("Ladder");
                        break;
                    case 2:
                        pl2_Position = pl2_Position - pl2_DiceRollNumber;
                        System.out.println("Snake");
                        break;
                }
                if(pl2_Position < 0)
                {
                    pl2_Position = 0;
                }
                if (pl2_Position > 100)
                {
                    pl2_Position = 100;
                }
                System.out.println("position of player two is: " + pl2_Position);

                if(pl2_Position == 100)
                {
                    turn = 0;
                    System.out.println("player 2 has won after " + pl2_numberOfDiceRoll + " rolls");
                }
                else
                {
                    if (pl2_Option != 1)
                    {
                        turn = 1;
                    }
                }
            }
            System.out.println("XXXXXXXXXXXXXXXXXX");
        }

    }
}
