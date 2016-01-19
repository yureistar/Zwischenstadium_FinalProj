public class Player{
    //instance vars
    private String letterBox; //just wrong letters
    private String[] playerAnswer;
    
    //default constructor
    public Player(){
	wordBox = new Object [8];
    }

    //return wordbox string
    public String getBox(){
	return letterBox;
    }

    //strikes is length of wordbox / 2
    public int getStrikes(){
	return letterBox.length/2
    }

    //returns true if there is underscore/empty letter
    //returns false if all letters filled in
    public boolean isEmpty(){
	for (int i=0;i<playerAnswer.size();i++){
	    if (playerAnswer[i].equals("_")){
		return true;
	    }
	}
	return false;
    }

    //checks to see if letter given is in the letterBox
    //returns true is in letterBox
    //false otherwise
    public boolean inBox(String in){
	return wordBox.indexOf(in) > 0;
    }
    
    //is the user input a letter in the answer
    public boolean correctGuess(String in){
	
    }
    
    //if user input letter not in answer, add to wordbox
    public void addToBox(){
    }

}//end class