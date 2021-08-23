package com.bridgelabz.snakeandladderproblem;

public class SnakeAndLadderGame {
	
	public static final int NO_PLAY=0;
	public static final int LADDER=1;
	public static final int SNAKE=2;
	
	public static void main(String[] args) {
		int startPosition=0;
		int currentPosition=0;
		int numberOnDie=(int)Math.floor(Math.random()*10)%6+1;
		int option=(int)Math.floor(Math.random()*10)%3;
		

		if(option==NO_PLAY) {
			
		}
		
		if(option==LADDER) {
			currentPosition+=numberOnDie;
		}
			
			
		if(option==SNAKE) {
		        currentPosition-=numberOnDie;
			
	    }
	}

}
