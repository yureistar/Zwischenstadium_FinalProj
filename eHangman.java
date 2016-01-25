public class eHangman extends Hangman{ //easy level
    //instance vars
    private static String strike1="____ "+"\n|"+"\n|"+"\n|"+"\n|"+"\n|";
    private static String strike2="____ "+"\n|  |"+"\n|"+"\n|"+"\n|"+"\n|";
    private static String strike3="____ "+"\n|  |"+"\n|  O"+"\n|"+"\n|"+"\n|";
    private static String strike4="____ "+"\n|  |"+"\n|  O"+"\n|  |"+"\n|  |"+"\n|";
    private static String strike5="____ "+"\n|  |"+"\n|  O"+"\n| /|"+"\n|  |"+"\n|";
    private static String strike6="____ "+"\n|  |"+"\n|  O"+"\n| /|\\"+"\n|  |"+"\n|";
    private static String strike7="____ "+"\n|  |"+"\n|  O"+"\n| /|\\"+"\n|  |"+"\n| / ";
    private static String strike8="____ "+"\n|  |"+"\n|  O"+"\n| /|\\"+"\n|  |"+"\n| / \\";
    private String[] strikes = {" ",strike1,strike2,strike3,strike4,strike5,strike6,strike7,strike8};
<<<<<<< HEAD
    
    public String getHangman(int num){
	return strikes[num];
    }
    
=======

    public String getHangman(int num){
	return strikes[num];
    }

>>>>>>> 49f496a99de584c7a5d8cb3043f705d3005d65e8
    /*
    public static void main (String[]args){
	System.out.println(strike1);
	System.out.println(strike2);
	System.out.println(strike3);
	System.out.println(strike4);
	System.out.println(strike5);
	System.out.println(strike6);
	System.out.println(strike7);
	System.out.println(strike8);
    }
    */
    //make subclasses for difficulty

    
}//end class
