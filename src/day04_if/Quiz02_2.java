package day04_if;

import java.util.Scanner;

public class Quiz02_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String home="";
		String company="";
		int number ;
		while(true) {
			System.out.println("1.�츮�� ���");
			System.out.println("2.ȸ�� ���");
			System.out.println("3.��� ����");
			number = input.nextInt();
			switch(number){
			case 1: 
				System.out.println("�츮�� ������ �Է�: ");
				home=input.next();break;
			case 2:
				System.out.println("ȸ�� ������ �Է�: ");
				company=input.next();break;
			case 3:System.out.println("�츮��: "+home);
					System.out.println("ȸ��: "+company);
					break;
			}
		}
		
		

	}

}
