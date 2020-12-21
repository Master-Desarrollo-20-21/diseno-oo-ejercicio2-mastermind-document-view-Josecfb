package views;

import models.Game;

public abstract class View {
	protected Game game;
	
	public View(Game game) {
		this.game=game;
	}
}
