package day04_if;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ����1.���� �� ���� �Է¹޾Ƽ�, �� ���� 50 �̻��� ������ 50�̸��� ������ �Ǵ��غ���.
		System.out.println("�� �Է�: ");
		int num = input.nextInt();
		if (num >= 50)
			System.out.println(num + "�� 50�̻��̴�");
		else
			System.out.println(num + "�� 50�̸��̴�");

		// ����2 ���� �� ���� �Է¹޾Ƽ�, �� ���� 3�� ������� �Ǵ��غ�����
		System.out.println("�� �Է�: ");
		int num2 = input.nextInt();
		if (num2 % 3 == 0)
			System.out.println(num2 + "�� 3�� ���");
		else
			System.out.println(num2 + "�� 3�� ����� �ƴϴ�");

		// ����3 �� �� kor, eng, math�� �Է¹޾� ����� 90�̻��̸� A, 80�̻��̸� B, 70�� �̻��̸� C, 70�̸��̸� D��
		// ����Ͻÿ�.
		System.out.println("�� �� �Է�: ");
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

		// ����4 ���� ������ �Է¹޾� �ִ밪 �� �ּҰ� ���ϱ�
		System.out.println("�� ���� �Է�: ");
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
		System.out.println("�ִ밪: " + max + " �ּҰ�: " + min);

		/*
		 * ����5 ���� �� ���� �Է� �޾Ƽ� ���ǽǹ�ȣ ����ϱ� ������ 1.���� 2.���� 3.���� 4.���� code���� 1�̸� "101ȣ" 2�̸�
		 * "102ȣ", 3�̸� "203ȣ", 4�̸� "202ȣ", ������ 5���ʹ� "�������� ����"
		 */
		System.out.println("1.���� 2.���� 3.���� 4.����");
		int num6 = input.nextInt();
		if (num6 == 1)
			System.out.println("101ȣ ���ǽ��Դϴ�.");
		else if (num6 == 2)
			System.out.println("102ȣ ���ǽ��Դϴ�.");
		else if (num6 == 3)
			System.out.println("203ȣ ���ǽ��Դϴ�.");
		else if (num6 == 4)
			System.out.println("202ȣ ���ǽ��Դϴ�.");
		else
			System.out.println("�������� �������ֽñ� �ٶ��ϴ�.");

	}

}
