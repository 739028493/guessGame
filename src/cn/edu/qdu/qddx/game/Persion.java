package cn.edu.qdu.qddx.game;

import java.util.Scanner;

public class Persion extends Player {
	Scanner input = new Scanner(System.in);
	@Override
	public void inputName() {
		
		String playerName=input.next();
		setPlayerName(playerName);
	}

	@Override
	public int myFist() {
		int i=0;
		i=input.nextInt();
		return i;
	}
	  
}
