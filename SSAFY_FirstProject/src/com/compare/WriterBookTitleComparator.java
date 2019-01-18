package com.compare;

import java.util.Comparator;

public class WriterBookTitleComparator implements Comparator<Writer> {

	@Override
	public int compare(Writer o1, Writer o2) {
		return o1.bookTitle.compareTo(o2.bookTitle);
	}
	

}
