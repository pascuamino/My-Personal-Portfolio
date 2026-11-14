
import java.util.*;

public class SnakeGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int snake = 1;
        int food = random.nextInt(10) + 1;
        int score = 0;
        String move;

        System.out.println("==================");
        System.out.println("    SNAKE GAME");
        System.out.println("==================");

        while (true) {

            System.out.println("\nScore: " + score);
            System.out.println("Snake Position: " + snake);
            System.out.println("Food Position: " + food);

            System.out.print("Move (W/A/S/D) or Q to quit: ");
            move = input.nextLine().toUpperCase();

            if (move.equals("Q")) {
                break;
            }

            if (move.equals("D")) {
                snake++;
            }
            else if (move.equals("A")) {
                snake--;
            }
            else if (move.equals("W")) {
                snake += 2;
            }
            else if (move.equals("S")) {
                snake -= 2;
            }
            else {
                System.out.println("Invalid move!");
                continue;
            }

            if (snake < 1 || snake > 10) {
                System.out.println("Game Over!");
                break;
            }

            if (snake == food) {
                score += 10;
                System.out.println("You ate the food!");

                food = random.nextInt(10) + 1;
            }
        }

        System.out.println("\nGAME FINISHED!");
        System.out.println("Final Score: " + score);

        input.close();
    }
}
