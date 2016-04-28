package cn.edu.qdu.qddx.game;
import java.util.Scanner;

public class Judger {
	private Persion persion= new Persion();
	private Computer computer = new Computer();
	private int total;
	
	public void  startGame(){
		//������ʼ��Ϸ
		System.out.println("****************");
		System.out.println("***��ȭ����ʼ***");
		System.out.println("****************");
		//��������
		System.out.println("��ȭ����1������2��ʯͷ3����");
	}
	//��������
	public void askName(){
		System.out.println("��ѡ��Է���ɫ��1���ܲ�2������3����Ȩ");
		//ѡ����Խ�ɫ
		computer.inputName();
		System.out.println("�������������");
		//�����Լ�����
		persion.inputName();
		//���˭VS˭
		System.out.println(persion.getPlayerName()+"VS"+computer.getPlayerName());
		
	}
	public int playGame(){//��ȭ���ж�
		Scanner input = new Scanner(System.in);
		String flag1=null;
		String flag2=null;
		do{
		System.out.println("Ҫ��ʼ�𣿣�Y/N��");
		//�����Ƿ�ʼ
		flag1=input.next();
		if(flag1.equalsIgnoreCase("y")) {
		//���ȭ
		System.out.println("���ȭ��1������2��ʯͷ3����");
		int persionNum=persion.myFist();
		//������ʲô
		switch (persionNum) {
		case 1:
			System.out.println(persion.getPlayerName()+"��ȭ:  ����");
			break;
		case 2:
			System.out.println(persion.getPlayerName()+"��ȭ:  ʯͷ");
			break;
		case 3:
			System.out.println(persion.getPlayerName()+"��ȭ:  ��");
			break;

		default:
			break;
		}
		int computerNum=computer.myFist();
		//������ֽ�ɫ��ʲô
		switch (computerNum) {
		case 1:
			System.out.println(computer.getPlayerName()+"��ȭ:  ����");
			break;
		case 2:
			System.out.println(computer.getPlayerName()+"��ȭ:  ʯͷ");
			break;
		case 3:
			System.out.println(computer.getPlayerName()+"��ȭ:  ��");
			break;

		default:
			break;
		}
		if (computerNum==persionNum) {
			System.out.println("ƽ��");
		}
		if ((persionNum==1&&computerNum==2)||(persionNum==2&&computerNum==3)||(persionNum==3&&computerNum==1)) {
			System.out.println("�����ˣ��汿��");
			computer.setWinningTimes(computer.getWinningTimes()+1);
			
		}
		if ((persionNum==2&&computerNum==1)||(persionNum==3&&computerNum==2)||(persionNum==1&&computerNum==3)) {
			System.out.println("��Ӯ�ˣ�ôô�գ�");
			persion.setWinningTimes(persion.getWinningTimes()+1);
		}
		total++;
		}else {
			System.out.println("�Ƿ�ʼ��һ�֣���Y/N��");
			flag2=input.next();
			
		}
		System.out.println("�Ƿ�ʼ��һ�֣���Y/N��");
		flag2=input.next();
		input.close();
		
	}while(flag2.equalsIgnoreCase("y"));
		return total;
	}
	public void finalResult() {//���ս��
		System.out.println(persion.getPlayerName()+"VS"+computer.getPlayerName());
		System.out.println("��ս������"+total);
		System.out.println("����         �÷�");
		System.out.println(persion.getPlayerName()+"       "+persion.getWinningTimes());
		System.out.println(computer.getPlayerName()+"       "+computer.getWinningTimes());
		if (persion.getWinningTimes()>computer.getWinningTimes()) {
			System.out.println("��������Ӯ�ˣ�����Ŭ����");
			}
			else if (persion.getWinningTimes()<computer.getWinningTimes()) {
			System.out.println("�Ǻǣ��������´μ��Ͱ���");
		}
			else {
			System.out.println("������!");
		}
	}
}

