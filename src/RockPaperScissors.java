import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// user input.
		Scanner scanner = new Scanner(System.in);
		// remove restart.
		while(true) {
			
			//randomised computer input.
			//store into array.
			String[] rps = {"ROCK", "PAPER", "SCISSORS"};
			// use index in array to random. 0-3.
			String computerMove = rps[new Random().nextInt(rps.length)];
			
			// store player input.
			String playerMove;
			
			// if player input other.
			while (true) {
			System.out.println("Please choose - ROCK, PAPER or SCISSORS.");
			// get next line of input form player.
			playerMove = scanner.nextLine();
				if (playerMove.equals("ROCK") || playerMove.equals("PAPER") || playerMove.equals("SCISSORS")) {
				break;
				}
				System.out.println(playerMove + " is an invalid move!");
			}
			//print out what computer chose.
			System.out.println("Computer played: " + computerMove);
			
			if (playerMove.equals(computerMove)) {
				System.out.println("GAME DRAW!");
			}
			// all condition player could apply with the computer.
			else if (playerMove.equals("ROCK")) {
				if (computerMove.equals("PAPER")) {
					System.out.println("YOU LOSE!");
					
				}else if (computerMove.equals("SCISSORS")) {
					System.out.println("YOU WIN!");
			}
			}
				else if (playerMove.equals("PAPER")) {
					if (computerMove.equals("ROCK")) {
						System.out.println("YOU WIN!");
						
					}else if (computerMove.equals("SCISSORS")) {
						System.out.println("YOU LOSE!");
				}
				}
					else if (playerMove.equals("SCISSORS")) {
						if (computerMove.equals("PAPER")) {
							System.out.println("YOU WIN!");
							
						}else if (computerMove.equals("ROCK")) {
							System.out.println("YOU LOSE!");
				}
			}
			System.out.println("Play Again?;) - (YES/NO)");
			String playAgain = scanner.nextLine();
			
			if(!playAgain.equals("YES")) {
				break;
			}
		}
	}		
				
}
