package views;

import models.Attempt;
import models.Game;
import models.ProposedCombination;

public class ViewGame extends View{
	private StartView startView;
	private ResumeView resumeView;
	private AttemptsView attemptsView;
	private ProposedCombinationView proposedCombinationView;

	public ViewGame(Game game) {
		super(game);
		this.startView = new StartView();
		this.resumeView = new ResumeView(game);	
		this.attemptsView=new AttemptsView(game);
		this.proposedCombinationView=new ProposedCombinationView();
	}

	public void interact() {
		startView.show();
		do {
			this.game.reset();
			this.play();
		} while (this.resumeView.isResume());
	}
	
	private void play() {
		Attempt attempt;
		do {
			attemptsView.show();
			attempt=game.newAttempt();
			attempt.setProposedCombination(new ProposedCombination(this.proposedCombinationView.read()));
			attempt.setResult();
		}while(game.getNumCurrentAttempts()<game.getMAX_ATTEMPT() && !attempt.isWinner());
		resumeView.evaluateWin();
	}

}
