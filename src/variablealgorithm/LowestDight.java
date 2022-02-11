package variablealgorithm;

import java.util.Scanner;

//키보드에서 입력한 정숫값에 마지막 자릿수를 제외한 값과 마지막 자릿수를 표시
public class LowestDight {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("머리속에 떠오르는 정수를 입력 해보아라 ");
		int a = stdIn.nextInt();
		System.out.println("입력한 정수는 " + a + " 입니다.");
		
		System.out.println("입력한 정수의 마지막 자릿수를 제외 한 값은 " + (a / 10) + " 입니다.");
		System.out.println("입력한 정수의 마지막 자릿수는 " +  (a % 10) + " 입니다.");
	}

}
