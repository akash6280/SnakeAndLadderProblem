package com.bridgelabz.snakeandladderproblem;

public class SnakeAndLadderGame {
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	public static void main(String[] args) {
		
		int currentPositionPlayer1=0;
		int currentPositionPlayer2=0;
		int currentPlayer=(int)Math.floor(Math.random()*10)%2+1;
		
		while(currentPositionPlayer1<100 && currentPositionPlayer2<100) {
			
			int numberOnDie=(int)Math.floor(Math.random()*10)%6+1;
			int option=(int)Math.floor(Math.random()*10)%3;
			
			if(option==NO_PLAY) {
				
			}
			
			if(option==LADDER) {
				if(currentPlayer==1) {
					if(currentPositionPlayer1+numberOnDie>100)
					{}
					else
						currentPositionPlayer1+=numberOnDie;
					currentPlayer=1;
			     }
				if(currentPlayer==2) {
					if(currentPositionPlayer2+numberOnDie>100)
					{}
					else
						currentPositionPlayer2+=numberOnDie;
					currentPlayer=2;
			     }
			}
				
				
			if(option==SNAKE) {
				if(currentPlayer==1) {
			        currentPositionPlayer1-=numberOnDie;
					if(currentPositionPlayer1<0)
						currentPositionPlayer1=0;
					currentPlayer=2;
		     	}
				if(currentPlayer==2) {
			        currentPositionPlayer2-=numberOnDie;
					if(currentPositionPlayer2<0)
						currentPositionPlayer2=0;
					currentPlayer=1;
		    	}
			}
		
			if(currentPositionPlayer2==100||currentPositionPlayer1==100)
			break;
		
	} 
		if(currentPositionPlayer1==100)
			System.out.println("PLAYER 1 WINS");
		if(currentPositionPlayer2==100)
			System.out.println("PLAYER 2 WINS");

}
}

