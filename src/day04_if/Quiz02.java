package day04_if;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~7���� �Է��Ͻÿ�");
		int num = input.nextInt();
		num = num % 7;
		switch (num) {
		case 1:
			System.out.println("������"); break;
		case 2:
			System.out.println("ȭ����"); break;
		case 3:
			System.out.println("������"); break;
		case 4:
			System.out.println("�����"); break;
		case 5:
			System.out.println("�ݿ���"); break;
		case 6:
			System.out.println("�����"); break;
		default:
			System.out.println("�Ͽ���");
		}
		
		String home="";
		String company="";
		int number = input.nextInt();
		while(true) {
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			switch(number){
			case 1: 
				System.out.println("�츮�� ������ �Է�: ");
				home=input.next();break;
			case 2:
				System.out.println("ȸ�� ������ �Է�: ");
				company=input.next();break;
			case 3:System.out.println("�츮��: "+home);
					System.out.println("ȸ��: "+company);
			}
		}
		
		

	}

}
