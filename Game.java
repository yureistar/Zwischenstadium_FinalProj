public Game{
    //instance vars
    private static final Object[] TOPICS = {A,B,C};
    private static final String[] A = {"A","Andrea ate apples and that was it."};
    private static final String[] B = {"B","Bunny.", "Bishy Blishwick wishes he had bushy eyebrows."};
    private static final String[] C = {"C","Chester the Chatty Cat chatted with Chad."};
    
    private Object[] realAnswer;

    //default constructor 
    public Game{
	String[] Topic=TOPICS[Math.random()*TOPICS.length];
	String[] Answer=Topic[Math.random()*Topic.length];
    }

    //main
    public static void main(String[] args){

    }//end main
}//end game