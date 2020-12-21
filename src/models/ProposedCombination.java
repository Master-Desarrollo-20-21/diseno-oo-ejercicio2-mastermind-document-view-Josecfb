package models;

import views.ProposedCombinationView;

public class ProposedCombination extends Combination {
	
	public ProposedCombination(String combinationString) {
		createCombination(combinationString);
	}

    public void read() {
		createCombination(new ProposedCombinationView().read());
    }

    private void createCombination(String combinationString){
        for (int i=0;i<LENGTH;i++) {
			this.colors[i]=Color.getColorByChar(combinationString.charAt(i));
		}
    }

}
