package day04_if;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1~7까지 입력하시오");
		int num = input.nextInt();
		num = num % 7;
		switch (num) {
		case 1:
			System.out.println("월요일"); break;
		case 2:
			System.out.println("화요일"); break;
		case 3:
			System.out.println("수요일"); break;
		case 4:
			System.out.println("목요일"); break;
		case 5:
			System.out.println("금요일"); break;
		case 6:
			System.out.println("토요일"); break;
		default:
			System.out.println("일요일");
		}
		
		String home="";
		String company="";
		int number = input.nextInt();
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			switch(number){
			case 1: 
				System.out.println("우리집 목적지 입력: ");
				home=input.next();break;
			case 2:
				System.out.println("회사 목적지 입력: ");
				company=input.next();break;
			case 3:System.out.println("우리집: "+home);
					System.out.println("회사: "+company);
			}
		}
		
		

	}

}
