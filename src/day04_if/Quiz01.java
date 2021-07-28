package day04_if;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 문제1.정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
		System.out.println("수 입력: ");
		int num = input.nextInt();
		if (num >= 50)
			System.out.println(num + "은 50이상이다");
		else
			System.out.println(num + "은 50미만이다");

		// 문제2 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보세요
		System.out.println("수 입력: ");
		int num2 = input.nextInt();
		if (num2 % 3 == 0)
			System.out.println(num2 + "는 3의 배수");
		else
			System.out.println(num2 + "는 3의 배수가 아니다");

		// 문제3 세 수 kor, eng, math를 입력받아 평균이 90이상이면 A, 80이상이면 B, 70점 이상이면 C, 70미만이면 D를
		// 출력하시오.
		System.out.println("세 수 입력: ");
		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();
		int sum = (kor + eng + math) / 3;

		if (sum >= 90)
			System.out.println("A");
		else if (sum >= 80)
			System.out.println("B");
		else if (sum >= 70)
			System.out.println("C");
		else
			System.out.println("D");

		// 문제4 정수 세개를 입력받아 최대값 및 최소값 구하기
		System.out.println("세 정수 입력: ");
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int max, min;

		max = num3;
		min = num5;
		if (max < num4)
			max = num4;
		if (max < num5)
			max = num5;

		if (min > num3)
			min = num3;
		if (min > num4)
			min = num4;
		System.out.println("최대값: " + max + " 최소값: " + min);

		/*
		 * 문제5 정수 한 개를 입력 받아서 강의실번호 출력하기 과목은 1.수학 2.과학 3.영어 4.역사 code값은 1이면 "101호" 2이면
		 * "102호", 3이면 "203호", 4이면 "202호", 나머지 5부터는 "상담원에게 문의"
		 */
		System.out.println("1.수학 2.과학 3.영어 4.역사");
		int num6 = input.nextInt();
		if (num6 == 1)
			System.out.println("101호 강의실입니다.");
		else if (num6 == 2)
			System.out.println("102호 강의실입니다.");
		else if (num6 == 3)
			System.out.println("203호 강의실입니다.");
		else if (num6 == 4)
			System.out.println("202호 강의실입니다.");
		else
			System.out.println("상담원에게 문의해주시기 바랍니다.");

	}

}
