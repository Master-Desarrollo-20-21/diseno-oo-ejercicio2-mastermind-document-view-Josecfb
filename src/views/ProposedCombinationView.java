package views;

import java.util.HashSet;
import java.util.Set;

import Utils.Console;
import models.Color;
import models.Combination;

public class ProposedCombinationView {
	public String read() {
		String proposedString;
		do {
			proposedString=new Console().read("Propose a combination: ");
        }while(!this.isValid(proposedString));
		return proposedString;
	}
	
	private boolean isValid(String proposedString){
        Console console=new Console();
        if(!isValidLength(proposedString)){
            console.write("Wrong proposed combination length\n");
            return false;
        }

        if(!this.isValidColor(proposedString)) {
			console.write("Wrong colors they must be: " + Color.getAvailableColors()+"\n");
			return false;
        }

        if(this.isRepeatedColor(proposedString)) {
			console.write("Wrong proposed, can not repeat color.\n");
			return false;
		}
        return true;
    }
	
	private boolean isValidLength(String proposedString) {
		return proposedString.length()==Combination.LENGTH;
    }

    private boolean isValidColor(String proposedString) {

        String[] proposedArray = proposedString.split("");
        for (String item : proposedArray) {
            if(!Color.getAvailableColors().contains(item)){
                return false;
            }
        }
		return true;
    }

    private boolean isRepeatedColor(String proposedString) {
        Set<Character> chars = new HashSet<Character>();
        for (char c : proposedString.toCharArray()) {
            if (!chars.add(c)) return true;
        }
        return false;
    }
}
