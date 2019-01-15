package korea.busan;

import korea.seoul.Tommy;

//접근수식어(접근지정자, 접근 제한자)
// public > protected > default > private
public class Bill {
	public static void main(String[] args) {
		Tommy t= new Tommy();
		
		t.go();
		System.out.println(t.age);
		
	}
}
