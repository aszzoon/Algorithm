package classalgorithm;
// ���Ŭ����
class human {
	String name; // �̸�
	int height; // ����
	int weight; // ü��
}
// ���Ŭ���� human�� �׽�Ʈ �ϴ� Ŭ����
class humantester {
	public static void main(String[] args) {
		
	human GD = new human();
	human YDG = new human();
	
	GD.name = "����";
	GD.height = 170;
	GD.weight = 60;
	
	YDG.name = "�α�";
	YDG.height = 188;
	YDG.weight = 68;
	
	System.out.println("�̸�:"+GD.name); // GD�� ������ 
	System.out.println("Ű:"+GD.height);
	System.out.println("ü��:"+GD.weight);
	System.out.println();

	System.out.println("�̸�:"+YDG.name); // YDG�� ������
	System.out.println("Ű:"+YDG.height);
	System.out.println("ü��:"+YDG.weight);
	}
}
