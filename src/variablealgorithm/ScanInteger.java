package variablealgorithm;

import java.util.Scanner; // 키보드 입력 시 적용됨

// 키보드에 입력한 정숫값 표시
// 프로그램의 시작 부분(클래스 선언 이전)에 작성한다
class ScanInteger {

	public static void main(String[] args) {
		//main 메서드의 시작부분
		Scanner stdIn = new Scanner(System.in); // 키보드 입력 함수
		
		System.out.print("정수값:"); // 키보드를 통해 정수값을 받음
		 int a = stdIn.nextInt(); // 정수 a = 키보드 입력 값
		 System.out.println(a +"를 입력했습니다.");
	}

}
