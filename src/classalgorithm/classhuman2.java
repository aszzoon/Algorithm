package classalgorithm;

class classhuman2 {
	private String name; // �̸�
	private int height; // ����
	private int weight; // ü��
	
	// ������
	classhuman2(String n, int h, int w) {
		name = n; height = h ; weight=w;
	}
	
	String getName() { return name;} // �̸� ��������
	int getHeight() { return height;} // ���� �ҷ�����
	int getWeight() { return weight;} // ü�� �ҷ�����
	
	void gainWeight(int w) {weight += w;} // �������
	void reduceWeight(int w) {weight -= w;} // ���� ������

}
