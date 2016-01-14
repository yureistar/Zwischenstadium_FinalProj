public class Player{
    //instance vars
    private String wordBox; //just wrong letters
    private Object[] playerAnswer;
    
    //default constructor
    public Player{
	wordBox = new Object [8];
    }

    //checks to see if letter given is in the wordBox
    public boolean inBox(String in){
	return wordBox.indexOf(in) > 0;
    }

    public 
}//end class