package ch06;

class Tv {
//	Tv�� �Ӽ�(�������)
	String color; 	// ����
	boolean power;  // ��������(on/off)
	int channel;    // ä��
	
//	Tv�� ���(�޼���)
	void power() {power = !power;}    // Tv�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}     // Tv�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;}	  // Tv�� ä���� ���ߴ� ����� �ϴ� �޼���
}

public class Ex6_1 {

	public static void main(String[] args) {
			
		Tv t = new Tv(); // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ���� �� Tv�ν��Ͻ��� �����Ѵ�
		t.channel = 7;   // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");

	}

}
