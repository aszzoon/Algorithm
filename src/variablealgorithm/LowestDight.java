package variablealgorithm;

import java.util.Scanner;

//Ű���忡�� �Է��� �������� ������ �ڸ����� ������ ���� ������ �ڸ����� ǥ��
public class LowestDight {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�Ӹ��ӿ� �������� ������ �Է� �غ��ƶ� ");
		int a = stdIn.nextInt();
		System.out.println("�Է��� ������ " + a + " �Դϴ�.");
		
		System.out.println("�Է��� ������ ������ �ڸ����� ���� �� ���� " + (a / 10) + " �Դϴ�.");
		System.out.println("�Է��� ������ ������ �ڸ����� " +  (a % 10) + " �Դϴ�.");
	}

}
