import cs1.Keyboard;
public class Game{
    //instance vars
    private final static String[] A = {"A","Andrea ate apples and that was it."};
    private final static String[] B = {"B","Bunny.", "Bishy Blishwick wishes he had bushy eyebrows."};
    private final static String[] C = {"C","Chester the Chatty Cat chatted with Chad."};
    private final static Object[][] TOPICS = {A,B,C};
    private final static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private final String[] realAnswer;
   

    //default constructor 
    public Game(){
	/***Choosing a topic...***/
	//inclusive randomizer = [rand* { (max-min) +1 } ]+min
	Object[] Topic=TOPICS[(int)(Math.random()*TOPICS.length)];
	String Answer=(Topic[(int)((Math.random()*(Topic.length - 1)) + 1)]).toString(); //exclude index 0, change object to string
	realAnswer = new String[Answer.length()];
	//put each element in answer string in the answer array separately
	for (int i = 0; i < Answer.length(); i++){
	    realAnswer[i] = Answer.substring(i,i+1);
	    System.out.print(realAnswer[i]);
	}
	System.out.println();
    }

    //check for errors
    public boolean isValid(String letter){
	//check if letter has a length of ONE
	boolean length = letter.length() == 1;
	//check if it is a letter
	boolean isLetter = letters.indexOf(letter) > 0;
	return length == true && isLetter == true;
    }

    //accessor for realAnswer
    public String[] getRealAnswer(){
	return realAnswer;
    }

    //the game
    public void game(Player p){
	System.out.println("Hangman ");
	
	while (p.isEmpty() && p.getStrikes() < 8){//where isEmpty checks to see if player has answered completely
	    System.out.println("======================================");
	    System.out.println(p);
	    System.out.print("Your guess:");
	    String letter = Keyboard.readString().toUpperCase();
	    //run code to check if guess is valid or not (error handling)
	    if (isValid(letter)){
		//run code to check if guess is in answer or not and deal with accordingly
		if (p.inBox(letter)) 
		    System.out.println("You already guessed this letter.");
		else if (p.isCorrect(this,letter)){
		    p.addToAnswer(this,letter);
		}
		else
		    p.addToBox(letter);
		System.out.println("Good guess!");
	    }
	    else
		System.out.println("Sorry, invalid input. Please try again.");
	}

	System.out.println("GAME IS DONE");
    }

    //main
    public static void main(String[] args){
	Game test=new Game();
	Player you=new Player(test);
	test.game(you);
    }//end main
}//end game