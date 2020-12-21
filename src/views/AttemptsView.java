package views;

import Utils.Console;
import models.Game;

public class AttemptsView extends View{
	
	public AttemptsView(Game game) {
		super(game);
	}
	
	public void show() {
		Console console=new Console();
		console.write(game.getNumCurrentAttempts()+" attempt(s):");
		console.write(game.getSecretCombination().toString());
		for (int i=0;i<game.getNumCurrentAttempts();i++) {
			console.write(game.getAttempt(i).toString());	
		}
	}
}
