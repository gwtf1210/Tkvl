package korea.busan;

import korea.seoul.Tommy;

//���ټ��ľ�(����������, ���� ������)
// public > protected > default > private
public class Bill {
	public static void main(String[] args) {
		Tommy t= new Tommy();
		
		t.go();
		System.out.println(t.age);
		
	}
}
