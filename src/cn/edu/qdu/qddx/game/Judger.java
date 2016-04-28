package cn.edu.qdu.qddx.game;
import java.util.Scanner;

public class Judger {
	private Persion persion= new Persion();
	private Computer computer = new Computer();
	private int total;
	
	public void  startGame(){
		//宣布开始游戏
		System.out.println("****************");
		System.out.println("***猜拳，开始***");
		System.out.println("****************");
		//宣布规则
		System.out.println("出拳规则：1、剪刀2、石头3、布");
	}
	//输入姓名
	public void askName(){
		System.out.println("请选择对方角色：1、曹操2、刘备3、孙权");
		//选择电脑角色
		computer.inputName();
		System.out.println("请输入你的姓名");
		//输入自己姓名
		persion.inputName();
		//输出谁VS谁
		System.out.println(persion.getPlayerName()+"VS"+computer.getPlayerName());
		
	}
	public int playGame(){//出拳、判断
		Scanner input = new Scanner(System.in);
		String flag1=null;
		String flag2=null;
		do{
		System.out.println("要开始吗？（Y/N）");
		//控制是否开始
		flag1=input.next();
		if(flag1.equalsIgnoreCase("y")) {
		//你出拳
		System.out.println("请出拳！1、剪刀2、石头3、布");
		int persionNum=persion.myFist();
		//输出你出什么
		switch (persionNum) {
		case 1:
			System.out.println(persion.getPlayerName()+"出拳:  剪刀");
			break;
		case 2:
			System.out.println(persion.getPlayerName()+"出拳:  石头");
			break;
		case 3:
			System.out.println(persion.getPlayerName()+"出拳:  布");
			break;

		default:
			break;
		}
		int computerNum=computer.myFist();
		//输出对手角色出什么
		switch (computerNum) {
		case 1:
			System.out.println(computer.getPlayerName()+"出拳:  剪刀");
			break;
		case 2:
			System.out.println(computer.getPlayerName()+"出拳:  石头");
			break;
		case 3:
			System.out.println(computer.getPlayerName()+"出拳:  布");
			break;

		default:
			break;
		}
		if (computerNum==persionNum) {
			System.out.println("平局");
		}
		if ((persionNum==1&&computerNum==2)||(persionNum==2&&computerNum==3)||(persionNum==3&&computerNum==1)) {
			System.out.println("你输了，真笨！");
			computer.setWinningTimes(computer.getWinningTimes()+1);
			
		}
		if ((persionNum==2&&computerNum==1)||(persionNum==3&&computerNum==2)||(persionNum==1&&computerNum==3)) {
			System.out.println("你赢了，么么哒！");
			persion.setWinningTimes(persion.getWinningTimes()+1);
		}
		total++;
		}else {
			System.out.println("是否开始下一轮？（Y/N）");
			flag2=input.next();
			
		}
		System.out.println("是否开始下一轮？（Y/N）");
		flag2=input.next();
		input.close();
		
	}while(flag2.equalsIgnoreCase("y"));
		return total;
	}
	public void finalResult() {//最终结果
		System.out.println(persion.getPlayerName()+"VS"+computer.getPlayerName());
		System.out.println("对战次数："+total);
		System.out.println("姓名         得分");
		System.out.println(persion.getPlayerName()+"       "+persion.getWinningTimes());
		System.out.println(computer.getPlayerName()+"       "+computer.getWinningTimes());
		if (persion.getWinningTimes()>computer.getWinningTimes()) {
			System.out.println("哈哈，你赢了，继续努力！");
			}
			else if (persion.getWinningTimes()<computer.getWinningTimes()) {
			System.out.println("呵呵，笨笨，下次加油啊！");
		}
			else {
			System.out.println("棋逢对手!");
		}
	}
}

