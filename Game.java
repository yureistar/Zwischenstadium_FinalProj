import cs1.Keyboard;
public class Game{
    //instance vars
    private final static String[] ZODIAC = {"Zodiac Signs","Aries the Ram","Taurus the Bull","Gemini the Twins","Cancer the Crab","Leo the Lion","Virg the Maideno","Libra the Scales","Scorpio the Scorpion","Sagittarius the Centaur","Capricorn the Goat","Aquarius the Water Bearer","Pisces the Fish"};
    private final static String[] IDIOMS = {"Idioms/Phrases","Between the devil and the deep blue sea.","A penny for your thoughts?","Rub salt in one's wounds.","Curiousity killed the cat, but satisfaction brought it back","Quid pro quo.","Caveat emptor","Pro scientia atque sapientia","Once in a blue moon"};
    private final static String[] MISC = {"Misc","automatons","adaptive design","cruise east","very good luck","enlightening archive","the infinite cookie jar","freezing ability"};
    private final static Object[][] TOPICS = {ZODIAC,IDIOMS,MISC};
    private final static String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String nums = "0123456789";

    private final String CATEGORY;
    private final String[] realAnswer;
   

    //default constructor 
    public Game(){
	/***Choosing a topic...***/
	//inclusive randomizer = [rand* { (max-min) +1 } ]+min
	Object[] Topic=TOPICS[(int)(Math.random()*TOPICS.length)];
	String Answer=(Topic[(int)((Math.random()*(Topic.length - 1)) + 1)]).toString(); //exclude index 0, change object to string
	CATEGORY=Topic[0].toString();
	realAnswer = new String[Answer.length()];
	//put each element in answer string in the answer array separately
	for (int i = 0; i < Answer.length(); i++){
	    realAnswer[i] = Answer.substring(i,i+1).toUpperCase();
	    //System.out.print(realAnswer[i]);
	}
	System.out.println();
    }

    //check for errors for letter
    public boolean isValidL(String letter){
	//check if letter has a length of ONE
	boolean length = letter.length() == 1;
	//check if it is a letter
	boolean isLetter = letters.indexOf(letter) >= 0;
	return length == true && isLetter == true;
    }

    //check for errors for number input difficulty
    public boolean isValidN(String num){
	//check if letter has a length of ONE
	boolean length = num.length() == 1;
	//check if it is a letter
	boolean isNum = nums.indexOf(num) >= 0;
	return length == true && isNum == true;
    }

    //accessor for realAnswer
    public String[] getRealAnswer(){
	return realAnswer;
    }

    //the game
    public void game(Player p){
	System.out.println("Hangman ");
	System.out.println("--XII. HANGED MAN-- ");
        System.out.println("\"A very classic game of Hangman.\"");
        System.out.println("\n~~Rules~~");
        System.out.println("You are about to decide the fate of the hanged man. Depending on your answers, he may remain stationary or progress.");
        System.out.println("To save him, you will be presented with a puzzle.");
	System.out.println("If you successfully  solve the puzzle, then the man will be able to see a new sight of the world.");
	System.out.println("If you fail, then alas, it is a shame, but the man will stay at standstill.");
	System.out.println("Why are we doing this, you ask? The answer is not important.");
	System.out.println("Now, when you are ready...");
	System.out.println(" 1. Begin \n 2. End");
	System.out.print("Your choice: ");
	String ready = Keyboard.readString();
	while (!(isValidN(ready))){
	    System.out.println("Invalid input, try again.");
	    System.out.println("Now, when you are ready...");
	    System.out.println("1: Begin\t2: End");
	    System.out.print("Your choice: ");
	    ready = Keyboard.readString();
	}
	if (ready.equals("2")) return;
	else if (ready.equals ("1")) System.out.println("It's time to begin!");
	else System.out.println("Hm... Are you playing around? Then I suppose you do want to play. Alright. Let's begin!");
	System.out.println("======================================");
	System.out.println("Choose your difficulty: \n 1. Easy \n 2. Normal \n 3. Difficult");
	System.out.print("Your choice: ");
	String difficulty = Keyboard.readString();
	while (!(isValidN(difficulty))){
	    System.out.println("Invalid input, try again.");
	    System.out.println("Choose your difficulty: \n 1. Easy \n 2. Normal \n 3. Difficult");
	    System.out.print("Your choice: ");
	    difficulty = Keyboard.readString();
	}
	p.setHangman(difficulty);
	System.out.println("======================================");
	//System.out.println("empty?" + p.isEmpty());
	while (p.isEmpty() && p.getStrikes() < p.getHMClass().getMaxTries()){//where isEmpty checks to see if player has answered completely
	    p.setDisplay();
	    System.out.println(p);
	    System.out.println("Topic: "+CATEGORY);
	    System.out.print("Your guess: ");
	    String letter = Keyboard.readString().toUpperCase();
	    //run code to check if guess is valid or not (error handling)
	    if (isValidL(letter)){
		//run code to check if guess is in answer or not and deal with accordingly
		if (p.inBox(letter+" ")) {System.out.println("\n\n\n\n\n\n\n\n\n\nNope.");}
		else if (p.isCorrect(this,letter)){
		    p.addToAnswer(this,letter);
		    System.out.println("\n\n\n\n\n\n\n\n\n\nOne step closer to being a saving the man's life.");
		}
		else{
		    System.out.println("\n\n\n\n\n\n\n\n\n\nNope.");
		    p.addToBox(letter);
		}
	    }
	    else
		System.out.println("\n\n\n\n\n\n\n\n\n\nSorry, you know that's an invalid guess, right? Please try again.");
	    p.setDisplay();
	    System.out.println("======================================");
	}
	System.out.println(p);
	System.out.println("So... did the hanged man gain a new perspective?");
	System.out.println("The end.");
    }

    //main
    public static void main(String[] args){
	Game test = new Game();
	Player you = new Player(test);
	test.game(you);
    }//end main
}//end game
