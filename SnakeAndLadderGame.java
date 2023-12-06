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
        int startPosition = 0;

        //Uc-2
        Random random = new Random();
        int numberOfRoll = random.nextInt(6);
        System.out.println("Player rolls the dice and get " + numberOfRoll + " number");
    }
}
