package week01day2;
import java.util.Scanner;
import java.util.Random;

public class Mukchipa3 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int Ai;
		int I=3;
		int Win = 3;
		System.out.println("**************����� ����*******************");
		System.out.println("[0 = ��] [1 =��] [2 = ��] �Դϴ�");
		do {
			Random random = new Random();
			Ai = random.nextInt(3);
			Scanner sc = new Scanner(System.in);
			I = sc.nextInt();
			switch (I) {
			case 0:
				if (Ai == I) {
					System.out.println("�����ϴ�..");
					break;
				}
				if (Ai == 1) {
					System.out.println("�����ϴ�..");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("�̰���ϴ�!");
					Win = 1;
				}
				break;
			case 1:
				if (Ai == I) {
					System.out.println("�����ϴ�..");
					break;
				}
				if (Ai == 0) {
					System.out.println("�����ϴ�..");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("�̰���ϴ�!");
					Win = 1;
				}
				break;
			case 2:
				if (Ai == I) {
					System.out.println("�����ϴ�..");
					break;
				}
				if (Ai == 0) {
					System.out.println("�̰���ϴ�!");
					Win = 1;
				}
				if (Ai == 1) {
					System.out.println("�����ϴ�..");
					Win = 0;
				}
				break;
			default:
				System.out.println("�߸��� ���Դϴ�..");
				break;
			}
		} while (Ai == I);
		System.out.println("�̹��ǿ� ���� �ºΰ� ���ϴ�");
		System.out.println("*********************************************");
		do {
			Random random2 = new Random();
			Ai = random2.nextInt(3);
			Scanner sc = new Scanner(System.in);
			I = sc.nextInt();
			switch (I) {
			case 0:
				if (Ai == I) {
					System.out.println("�����ϴ�!");
					if (Win == 1) {
						System.out.println("�¸�!");
					}
					if (Win == 0) {
						System.out.println("�й�!");
					}
					break;
				}
				if (Ai == 1) {
					System.out.println("�����ϴ�..!");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("�̰���ϴ�!");
					Win = 1;
				}
				break;
			case 1:
				if (Ai == I) {
					System.out.println("�����ϴ�!");
					if (Win == 1) {
						System.out.println("�¸�!");
					}
					if (Win == 0) {
						System.out.println("�й�!");
					}
					break;
				}
				if (Ai == 0) {
					System.out.println("�����ϴ�..");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("�̰���ϴ�!");
					Win = 1;
				}
				break;
			case 2:
				if (Ai == I) {
					System.out.println("�����ϴ�!");
					if (Win == 1) {
						System.out.println("�¸�!");
					}
					if (Win == 0) {
						System.out.println("�й�!");
					}
					break;
				}
				if (Ai == 0) {
					System.out.println("�̰���ϴ�!");
					Win = 1;
				}
				if (Ai == 1) {
					System.out.println("�����ϴ�..");
					Win = 0;
				}
				break;
			default:
				System.out.println("�߸��� ���Դϴ�..");
				break;
			}

		} while (Ai != I);
		System.out.println("*********************************************");
		
		long afterTime = System.currentTimeMillis(); // �ڵ� ���� �Ŀ� �ð� �޾ƿ���
		long end = System.currentTimeMillis();
		System.out.println("����ð�: " + (end - start) + " ms");
	}
}
