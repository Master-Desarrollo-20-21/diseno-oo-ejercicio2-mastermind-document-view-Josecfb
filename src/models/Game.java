package models;

public class Game {
	private Attempt[] attempts;
	private SecretCombination secretCombination;
	private int attemptCounter;
	private final int MAX_ATTEMPT=10;
	
	
	public Attempt newAttempt() {
		Attempt attempt;
		attempt=new Attempt(this.secretCombination);
		this.attempts[this.attemptCounter]=attempt;
		this.attemptCounter++;
		return attempt;
	}
	
	public void reset() {
		this.attempts=new Attempt[MAX_ATTEMPT];
		this.secretCombination=new SecretCombination();
		this.attemptCounter=0;
	}
	
	public int getNumCurrentAttempts() {
		return attemptCounter;
	}
	
	public Attempt getAttempt(int attempt) {
		return attempts[attempt];
	}
	
	public SecretCombination getSecretCombination() {
		return this.secretCombination;
	}

	public int getMAX_ATTEMPT() {
		return MAX_ATTEMPT;
	}

}