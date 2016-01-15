import cs1.Keyboard;

public class Game{
    //instance vars
    private final static String[] A = {"A","Andrea ate apples and that was it."};
    private final static String[] B = {"B","Bunny.", "Bishy Blishwick wishes he had bushy eyebrows."};
    private final static String[] C = {"C","Chester the Chatty Cat chatted with Chad."};
    private final static Object[] TOPICS = {A,B,C};

    private Object[] realAnswer;

    //default constructor 
    public Game(){
	/***Choosing a topic...***/
	//inclusive randomizer = [rand* { (max-min) +1 } ]+min
	Object Topic=TOPICS[(int)(Math.random()*TOPICS.length)];
	String Answer=Topic[(int)((Math.random()*Topic.length - 1) + 1)]; //exclude index 0
	realAnswer = new Object[Answer.length()];
	//put each element in answer string in the answer array separately
	for (int i = 0; i < Answer.length(); i++){
	    realAnswer[i] = Answer.substring(i,i+1);
	    System.out.print(realAnswer[i]);
	}
    }


    //the game
    /*
    public static void game(Player p, Hangman h){
	System.out.println("Hangman.");
	while (p.isEmpty() && p.getStrikes()<8){//where isEmpty checks to see if player has answered completely
	    System.out.println("======================================");
	    System.out.println(h);
	    System.out.print("Your guess:");
	    String letter = Keyboard.readString().toUpperCase();
	    //run code to check if guess is valid or not (error handling)
	    //run code to check if guess is in answer or not and deal with accordingly
	}
	}*/

    //main
    public static void main(String[] args){
	//Player you=new Player();
	//Hangman comp=new Hangman();
	//game(you,comp);
	Game test=new Game();
    }//end main
}//end game