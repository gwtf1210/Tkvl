package com.ssafy.algo_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 최장 증가 부분 수열 O(nlogn)
 */
public class Z43_LIS2_other {

	public static int N = 0; // [1, 300000]
	public static int dp[] = null;

	public static int arr[] = null; // 대상 수열
	public static int LIS[] = null; // LIS 배열
	public static int PATH[] = null; // 어느 지점에서 이어지는 지를 저장할 배열

	public static int MAX_INT = Integer.MAX_VALUE;

	/**
	 * a 배열에서 val의 위치를 반환하는 메서드
	 * 
	 * @param a   찾을 배열
	 * @param val 찾을 원소
	 * @return 배열에서 원소와 일치하는 index
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
		for (int i = 1; i < arr.length; i++) { // 0번 index = 0으로 초기화한다.
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.fill(LIS, MAX_INT); // LIS 배열 초기화
		int len = 1;
		LIS[0] = PATH[0] = 0; // 안해도 되는 작업
		LIS[1] = arr[1];
		for (int i = 1; i < arr.length; i++) {
			bw.write("---------- level " + i + " ----------\n");
			if (LIS[len - 1] < arr[i]) { // 최장 증가 수열에 추가할 수 있는 arr요소일 경우 (이전 최대값보다 큰 경우)
				PATH[i] = find(arr, LIS[len - 1]); // 이전 path것으로 초기화
				LIS[len++] = arr[i]; // 추가한다.

				bw.write("LIS  : " + Arrays.toString(LIS) + "\n");
				bw.write("PATH : " + Arrays.toString(PATH) + "\n");
				continue;
			}

			int idx = Arrays.binarySearch(LIS, arr[i]); // LIS는 정렬되어 있으므로 이분검색으로 찾는다. (arr[i]가 들어갈 위치)
			if (idx < 0) {
				idx = -(idx + 1);
				LIS[idx] = arr[i];
				PATH[i] = find(arr, LIS[idx - 1]); // 현재값이 들어갈 위치보다 한칸 작은 지점으로부터 오는 것으로 PATH를 지정한다.

				bw.write("LIS  : " + Arrays.toString(LIS) + "\n");
				bw.write("PATH : " + Arrays.toString(PATH) + "\n");
			}
		}

		// PATH 결과 출력
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

		bw.write("\n최장 증가 수열은" + result + "이다. 길이는 " + (len - 1) + "이다.");

		bw.flush();
		bw.close();

	}
}
