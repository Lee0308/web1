package chapter2_Theory;
import java.util.Scanner;

public class Switch_Grading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻʽÿ�.");
		char grade;
		int score = scanner.nextInt();
		switch (score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		System.out.println("������ " + grade + "�Դϴ�.");
		
		scanner.close();
	}

}