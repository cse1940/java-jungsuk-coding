package ch07;

public class MyParent {  
	private   int prv; // ���� Ŭ���� 
			  int dft; // ���� ��Ű��
	protected int prt; // ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public    int pub; // �������� ����
	
	public void printMembers() {
		System.out.println(prv); // Ok
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {

	public static void main(String[] args) {
		
		MyParent p = new MyParent();
//		System.out.println(p.prv); -> error
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);

	}

}
