package week01day2;
import java.util.Scanner;
import java.util.Random;

public class Mukchipa3 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int Ai;
		int I=3;
		int Win = 3;
		System.out.println("**************묵찌빠 게임*******************");
		System.out.println("[0 = 묵] [1 =찌] [2 = 빠] 입니다");
		do {
			Random random = new Random();
			Ai = random.nextInt(3);
			Scanner sc = new Scanner(System.in);
			I = sc.nextInt();
			switch (I) {
			case 0:
				if (Ai == I) {
					System.out.println("비겼습니다..");
					break;
				}
				if (Ai == 1) {
					System.out.println("졋습니다..");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("이겼습니다!");
					Win = 1;
				}
				break;
			case 1:
				if (Ai == I) {
					System.out.println("비겼습니다..");
					break;
				}
				if (Ai == 0) {
					System.out.println("졋습니다..");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("이겼습니다!");
					Win = 1;
				}
				break;
			case 2:
				if (Ai == I) {
					System.out.println("비겼습니다..");
					break;
				}
				if (Ai == 0) {
					System.out.println("이겼습니다!");
					Win = 1;
				}
				if (Ai == 1) {
					System.out.println("졌습니다..");
					Win = 0;
				}
				break;
			default:
				System.out.println("잘못된 값입니다..");
				break;
			}
		} while (Ai == I);
		System.out.println("이번판에 비기면 승부가 납니다");
		System.out.println("*********************************************");
		do {
			Random random2 = new Random();
			Ai = random2.nextInt(3);
			Scanner sc = new Scanner(System.in);
			I = sc.nextInt();
			switch (I) {
			case 0:
				if (Ai == I) {
					System.out.println("비겼습니다!");
					if (Win == 1) {
						System.out.println("승리!");
					}
					if (Win == 0) {
						System.out.println("패배!");
					}
					break;
				}
				if (Ai == 1) {
					System.out.println("졌습니다..!");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("이겼습니다!");
					Win = 1;
				}
				break;
			case 1:
				if (Ai == I) {
					System.out.println("비겼습니다!");
					if (Win == 1) {
						System.out.println("승리!");
					}
					if (Win == 0) {
						System.out.println("패배!");
					}
					break;
				}
				if (Ai == 0) {
					System.out.println("졌습니다..");
					Win = 0;
				}
				if (Ai == 2) {
					System.out.println("이겼습니다!");
					Win = 1;
				}
				break;
			case 2:
				if (Ai == I) {
					System.out.println("비겼습니다!");
					if (Win == 1) {
						System.out.println("승리!");
					}
					if (Win == 0) {
						System.out.println("패배!");
					}
					break;
				}
				if (Ai == 0) {
					System.out.println("이겼습니다!");
					Win = 1;
				}
				if (Ai == 1) {
					System.out.println("졌습니다..");
					Win = 0;
				}
				break;
			default:
				System.out.println("잘못된 값입니다..");
				break;
			}

		} while (Ai != I);
		System.out.println("*********************************************");
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long end = System.currentTimeMillis();
		System.out.println("수행시간: " + (end - start) + " ms");
	}
}
