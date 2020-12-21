package views;

import Utils.Console;
import models.Game;

public class ResumeView extends View{

	public ResumeView(Game game) {
		super(game);
	}

	public boolean isResume() {
		String answer;
		do {
			answer=new Console().read("RESUME? (y/n):");
		}while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));
		return answer.equalsIgnoreCase("y");
	}
	
	public void evaluateWin() {
		Console console=new Console();
		if (game.getAttempt(game.getNumCurrentAttempts()-1).isWinner()) {
			console.write("You win");
		}else {
			console.write("Has perdio");
		}
	}
}
