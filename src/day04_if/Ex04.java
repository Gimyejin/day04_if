package day04_if;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int select;
		System.out.println("수 입력");
		select = input.nextInt();
		switch (select) {
		case 1:
			System.out.println("1.입력값: " + select);
			break;
		case 2:
			System.out.println("2.입력값: " + select);
			break;
		case 3:
			System.out.println("3.입력값: " + select);
			break;
		case 4:
			System.out.println("4.입력값: " + select);
			break;
		default:
			System.out.println("1,2,3,4 를 제외한 다른 값 입력 ");
		}
	}

}
