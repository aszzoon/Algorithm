package variablealgorithm;

import java.util.Scanner;

// 입력한 2개의 실숫값의 합과 평균을 표시
public class SumAveDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				System.out.println("실수 x 입력 해라");
				double a = sc.nextDouble();

				System.out.println("실수 y 입력 해라");
				double b = sc.nextDouble();
				
				System.out.println("합"+ (a + b) );
				System.out.println("평균"+ (a + b)/2 );
				
				
	}

}
