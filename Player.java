public class Player{
    //instance vars
    private String letterBox; //just wrong letters
    private String[] playerAnswer;
    private String display;
    private final static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Hangman comp = new Hangman();
    
    //default constructor
    public Player(){
	letterBox = "";
    }

    //overloaded constructor
    public Player(Game g){
	this();
	playerAnswer = new String[g.getRealAnswer().length];
	for (int i = 0; i < g.getRealAnswer().length; i++){
	    String character = g.getRealAnswer()[i].toUpperCase();
	    if (letters.indexOf(character) >= 0)
		playerAnswer[i] = "_ ";
	    else if (character.equals(" ")) //for spaces
		playerAnswer[i] = "  ";
	    else //takes care of punctuation marks
		playerAnswer[i] = character;
	}
	//for (String a : playerAnswer)
	//System.out.print(a);
    }

    //print out hangman
    public String toString(){
	return display;
    }

    //return letterbox string
    public String getBox(){
	return letterBox;
    }

    //strikes is length of letterbox / 2
    public int getStrikes(){
	return letterBox.length()/2;
    }
    
    //change le display
    public void setDisplay(){
	display=comp.getHangman(getStrikes()); 
	display+="\nTries Left: "+(8-this.getStrikes()); 
	display+="\nIncorrect Letters: "+letterBox+"\n";
	for (String a : playerAnswer)
	    display+=a;
    }

    //returns true if there is underscore/empty letter
    //returns false if all letters filled in
    public boolean isEmpty(){
	for (int i=0;i<playerAnswer.length;i++){
	    if (playerAnswer[i].equals("_ ")){
		return true;
	    }
	}
	return false;
    }

    //checks to see if letter given is in the letterBox
    //returns true is in letterBox
    //false otherwise
    public boolean inBox(String in){
	return letterBox.indexOf(in) > 0;
    }
    
    //is the user input a letter in the answer
    public boolean isCorrect(Game g,String in){
	String[] tempAns = g.getRealAnswer();
	for (String a : tempAns){
	    if (a.toUpperCase().equals(in))
		return true;
	}
	return false;
    }
    
    //if user input letter not in answer, add to letterbox
    public void addToBox(String in){
	letterBox+=in+" ";
    }


    //if user input letter in answer, add to playerAnswer as appropriate
    public void addToAnswer(Game g,String in){
	String[] tempAns = g.getRealAnswer();
	for (int i=0;i<tempAns.length;i++){
	    if (tempAns[i].equals(in)){
		playerAnswer[i]=in+" ";
	    }
	}
    }

}//end class
