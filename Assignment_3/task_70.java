package Assignment_3;

public class task_70 {

	public static void main(String[] args) {
		int x=calculateHighScorePosition(500);
		displayHighScorePosition("mike", x);
		displayHighScorePosition("tom" ,calculateHighScorePosition(500));
		
		
	}
	public static void displayHighScorePosition(String playername,int highScorePosition) {
		System.out.println(playername + " managed to get into position " + highScorePosition + " on the high score table");
		
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore>=1000) {
			return 1;
		}else if(playerScore>=500 && playerScore<1000) {
			return 2;
		}else if(playerScore>=100&&playerScore<500) {
			return 3;
		}else {
			return 4;
		}
	}

}
