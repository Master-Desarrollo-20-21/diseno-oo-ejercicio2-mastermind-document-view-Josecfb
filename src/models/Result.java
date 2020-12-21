package models;

public class Result {
	
	private int blacks;
	private int whites;
	
	public Result(int whites, int blacks) {
		this.blacks = blacks;
        this.whites = whites;
	}
	
	public String toString() {
		return whites+" blancas y "+blacks+" negras ";
	}
	
	public boolean isWinner() {
		return blacks==Combination.LENGTH;
	}

}
