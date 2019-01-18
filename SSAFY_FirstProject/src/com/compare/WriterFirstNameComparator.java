package com.compare;

import java.util.Comparator;

// Writer�� FirstName�� �������� �����ϴ� ���� ��ü
// Comparator �������̽���  implements�ؾ���
// compare() : ���ı����� ��Ÿ���� �޼ҵ�

public class WriterFirstNameComparator implements Comparator<Writer>{

	@Override
	public int compare(Writer o1, Writer o2) {
		return o1.firstName.compareTo(o2.firstName);
	}
	
	
}
