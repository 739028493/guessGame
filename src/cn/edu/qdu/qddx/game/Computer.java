package cn.edu.qdu.qddx.game;

import java.util.Scanner;

public class Computer extends Player {
	Scanner input=new Scanner(System.in);
	@Override
	public void inputName() {
		int i=input.nextInt();
		String playerName=null;
		if (i==1) {
			playerName="�ܲ�";
		}
		if (i==2) {
			playerName="����";
			
		}
		if (i==3) {
			playerName="��Ȩ";
			}
		setPlayerName(playerName);	
	}

	@Override
	public int myFist() {
		int m=(int) (Math.random()*3+1);
		return m;
	}

}
