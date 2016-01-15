public class Player{
    //instance vars
    private String letterBox; //just wrong letters
    private Object[] playerAnswer;
    
    //default constructor
    public Player(){
	wordBox = new Object [8];
    }

    //return wordbox string
    public String getBox(){
    }

    //strikes is length of wordbox / 2
    public int getStrikes(){
    }

    //are the underscores all filled in
    public boolean isEmpty(){
    }

    //checks to see if letter given is in the wordBox
    public boolean inBox(String in){
	return wordBox.indexOf(in) > 0;
    }

    //is the user input a letter in the answer
    public boolean correctGuess(){
    }
    
    //if user input letter not in answer, add to wordbox
    public void addToBox(){
    }

}//end class