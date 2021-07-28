package day04_if;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력: ");
		
		num = input.nextInt();
		if(num%3==0) {
			System.out.println(num+"은 3의 배수");
		}else {
			System.out.println(num+"은 3의 배수 아님");
		}
		System.out.println("다음 문장들 실행");

	}

}
