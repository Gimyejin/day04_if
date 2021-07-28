package day04_if;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("문자 입력");
		String str = input.next();
		switch (str) {
		case "안녕":
			System.out.println("안녕");
			break;
		case "그래":
			System.out.println("그래");
			break;

		}

	}
}
