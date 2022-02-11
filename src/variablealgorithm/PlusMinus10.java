package variablealgorithm;

import java.util.Scanner;

//키보드에 입력한 정숫값에 10을 더한 값과 10일 뺸 값을 출력하자.
class PlusMinus10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("입력한 값에 10을 더해 주마");
		
		int a = stdIn.nextInt();
		System.out.println(a+10);
	}

}
