package day04_if;

import java.util.Scanner;

public class Quiz02_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String home="";
		String company="";
		int number ;
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			number = input.nextInt();
			switch(number){
			case 1: 
				System.out.println("우리집 목적지 입력: ");
				home=input.next();break;
			case 2:
				System.out.println("회사 목적지 입력: ");
				company=input.next();break;
			case 3:System.out.println("우리집: "+home);
					System.out.println("회사: "+company);
					break;
			}
		}
		
		

	}

}
