package models;

public class Attempt {
	private ProposedCombination proposedCombination;
	private Result result;
	private SecretCombination secretCombination;

	public Attempt(SecretCombination secretCombination) {
		this.secretCombination=secretCombination;
		
	}

	public boolean isWinner() {
		return result.isWinner();
	}

	@Override
	public String toString() {
		return this.proposedCombination.toString() +
			" --> " + this.result.toString();
	}
	
	public void setProposedCombination(ProposedCombination proposedCombination) {
		this.proposedCombination=proposedCombination;
	}
	
	public void setResult() {
		this.result = secretCombination.evalueCombination(this.proposedCombination);
	}
	
}