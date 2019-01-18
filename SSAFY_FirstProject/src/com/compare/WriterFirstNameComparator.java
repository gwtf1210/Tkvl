package com.compare;

import java.util.Comparator;

// Writer의 FirstName을 기준으로 정렬하는 정렬 객체
// Comparator 인터페이스를  implements해야함
// compare() : 정렬기준을 나타내는 메소드

public class WriterFirstNameComparator implements Comparator<Writer>{

	@Override
	public int compare(Writer o1, Writer o2) {
		return o1.firstName.compareTo(o2.firstName);
	}
	
	
}
