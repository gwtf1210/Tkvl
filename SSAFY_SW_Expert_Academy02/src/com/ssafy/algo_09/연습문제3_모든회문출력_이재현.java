package com.ssafy.algo_09;

import java.util.HashSet;
import java.util.Iterator;

public class 연습문제3_모든회문출력_이재현 {
	public static HashSet<String> result = new HashSet<>();

	public static void DFS(String input, int count, int limit, boolean[] visit) {
		if (count == limit) {
			StringBuilder temp = new StringBuilder();

			for (int i = 0; i < visit.length; i++) {
				if (visit[i]) {
					temp.append(input.charAt(i));
				}
			}

			if (temp.length() != 0) {
				result.add(temp.toString());
			}
			return;
		}

		DFS(input, count + 1, limit, visit);
		visit[count] = true;
		DFS(input, count + 1, limit, visit);
		visit[count] = false;
	}

	public static void main(String[] args) {
		String input = "CBBCBAAB";
		boolean visit[] = new boolean[input.length()];

		DFS(input, 0, input.length(), visit);

		Iterator<String> cursor = result.iterator();

		while (cursor.hasNext()) {
			StringBuffer rightOrder = new StringBuffer(cursor.next());
			String right = rightOrder.toString();
			StringBuffer reverse = rightOrder.reverse();
			String reversed = reverse.toString();

			if (right.equals(reversed)) {
				System.out.println(right);
			}
		}
	}

}
