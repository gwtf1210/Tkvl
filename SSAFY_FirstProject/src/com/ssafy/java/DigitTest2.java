package com.ssafy.java;

public class DigitTest2 {

	public static void main(String[] args) {
		int k = 0;
		int[] k_cnt = {5,3,1,3,5};
		
		for(int i = 0; i <= 4; i++) {
			for(int j=5; j>k_cnt[i]; j--) {
				System.out.print("  ");	
			}
			for(int j=1; j<=k_cnt[i]; j++) {
				System.out.print((++k));
				if(k>=10) {
					System.out.print("  ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println("");
			System.out.println("");
		}

	}

}
