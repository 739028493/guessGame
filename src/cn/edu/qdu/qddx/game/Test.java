package cn.edu.qdu.qddx.game;

public class Test {
	public static void main(String[] args) {
		Judger judge = new Judger();
		judge.startGame();
		judge.askName();
		judge.playGame();
		judge.finalResult();
	}
}
