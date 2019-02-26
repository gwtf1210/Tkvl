package com.ssafy.algo_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * ���� ���� �κ� ���� O(nlogn)
 */
public class Z43_LIS2_other {

	public static int N = 0; // [1, 300000]
	public static int dp[] = null;

	public static int arr[] = null; // ��� ����
	public static int LIS[] = null; // LIS �迭
	public static int PATH[] = null; // ��� �������� �̾����� ���� ������ �迭

	public static int MAX_INT = Integer.MAX_VALUE;

	/**
	 * a �迭���� val�� ��ġ�� ��ȯ�ϴ� �޼���
	 * 
	 * @param a   ã�� �迭
	 * @param val ã�� ����
	 * @return �迭���� ���ҿ� ��ġ�ϴ� index
	 */
	private static int find(int a[], int val) {
		for (int i = 0; i < a.length; ++i)
			if (a[i] == val)
				return i;
		return -1;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];
		LIS = new int[N + 1];
		PATH = new int[N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < arr.length; i++) { // 0�� index = 0���� �ʱ�ȭ�Ѵ�.
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.fill(LIS, MAX_INT); // LIS �迭 �ʱ�ȭ
		int len = 1;
		LIS[0] = PATH[0] = 0; // ���ص� �Ǵ� �۾�
		LIS[1] = arr[1];
		for (int i = 1; i < arr.length; i++) {
			bw.write("---------- level " + i + " ----------\n");
			if (LIS[len - 1] < arr[i]) { // ���� ���� ������ �߰��� �� �ִ� arr����� ��� (���� �ִ밪���� ū ���)
				PATH[i] = find(arr, LIS[len - 1]); // ���� path������ �ʱ�ȭ
				LIS[len++] = arr[i]; // �߰��Ѵ�.

				bw.write("LIS  : " + Arrays.toString(LIS) + "\n");
				bw.write("PATH : " + Arrays.toString(PATH) + "\n");
				continue;
			}

			int idx = Arrays.binarySearch(LIS, arr[i]); // LIS�� ���ĵǾ� �����Ƿ� �̺а˻����� ã�´�. (arr[i]�� �� ��ġ)
			if (idx < 0) {
				idx = -(idx + 1);
				LIS[idx] = arr[i];
				PATH[i] = find(arr, LIS[idx - 1]); // ���簪�� �� ��ġ���� ��ĭ ���� �������κ��� ���� ������ PATH�� �����Ѵ�.

				bw.write("LIS  : " + Arrays.toString(LIS) + "\n");
				bw.write("PATH : " + Arrays.toString(PATH) + "\n");
			}
		}

		// PATH ��� ���
		String result = "";
		for (int i = PATH.length - 1; i >= 0; --i) {
			int j = i;
			StringBuilder builder = new StringBuilder();
			while (arr[j] != 0) {
				builder.append(arr[j] + " ");
				j = PATH[j];
			}
			if (result.length() <= builder.length())
				result = builder.reverse().toString();
		}

		bw.write("\n���� ���� ������" + result + "�̴�. ���̴� " + (len - 1) + "�̴�.");

		bw.flush();
		bw.close();

	}
}
