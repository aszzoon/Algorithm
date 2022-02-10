package classalgorithm;
// 사람클래스
class human {
	String name; // 이름
	int height; // 신장
	int weight; // 체중
}
// 사람클래스 human을 테스트 하는 클래스
class humantester {
	public static void main(String[] args) {
		
	human GD = new human();
	human YDG = new human();
	
	GD.name = "지용";
	GD.height = 170;
	GD.weight = 60;
	
	YDG.name = "두기";
	YDG.height = 188;
	YDG.weight = 68;
	
	System.out.println("이름:"+GD.name); // GD의 데이터 
	System.out.println("키:"+GD.height);
	System.out.println("체중:"+GD.weight);
	System.out.println();

	System.out.println("이름:"+YDG.name); // YDG의 데이터
	System.out.println("키:"+YDG.height);
	System.out.println("체중:"+YDG.weight);
	}
}
