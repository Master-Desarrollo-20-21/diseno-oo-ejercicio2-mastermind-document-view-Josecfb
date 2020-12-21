package models;

import views.ViewGame;

public class MasterMind {
	
	private Game game;
	private ViewGame view;
	
	public MasterMind() {
		this.game=new Game();
		this.game.reset();
		this.view=new ViewGame(game);
	}

	private void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new MasterMind().play();

	}

}
