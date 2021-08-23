package com.bridgelabz.snakeandladderproblem;

public class SnakeAndLadderGame {
	
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	public static void main(String[] args) {
		int startPosition=0;
		int currentPosition=0;
		while(currentPosition<100) {
			int numberOnDie=(int)Math.floor(Math.random()*10)%6+1;
			int option=(int)Math.floor(Math.random()*10)%3;
			
	
			if(option==NO_PLAY) {
				
			}
			
			if(option==LADDER) {
				if(currentPosition+numberOnDie>100)
				{}
				else
					currentPosition+=numberOnDie;
			}
				
				
			if(option==SNAKE) {
			        currentPosition-=numberOnDie;
			        if(currentPosition<0)
						currentPosition=0;
				
		    }
			if(currentPosition==100)
				break;
			
		}
		System.out.println("Player Wins");
			
	}

}
