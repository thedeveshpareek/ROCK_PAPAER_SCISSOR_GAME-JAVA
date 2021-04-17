import java.util.*;
public class Rock_paper_scissor_game_java {
    public static void main(String[] args) {
        int i= 1;
        while (i<=5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter\n 1. for 'ROCK' , \n 2. for 'PAPER' \n 3. for 'SCISSOR'");
            int userInput = sc.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt();
            i++;



            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if (userInput == 1 && computerInput == 3 || userInput == 2 && computerInput == 1 || userInput == 3 && computerInput == 2) {
                System.out.println("you win");
            } else {
                System.out.println("computer wins");
            }
i++;
        }
    }
}
