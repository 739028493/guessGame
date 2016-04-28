package cn.edu.qdu.qddx.game;

public abstract class  Player {
	private String playerName;//输入玩家姓名
	private int winningTimes;//统计所赢局数
	
	public abstract void inputName();
	public abstract int myFist();
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	

}
