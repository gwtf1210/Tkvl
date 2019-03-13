package com.ssafy.algo_14;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Z43_LIS2 {

	static int[] c;
	static int[] input = {8,2,4,3,6,11,7,10,14,5};
	
//	int bs(int v)
//	{
//	    int m;
//	    int l = 0, r =  input.length-1;
//	    while (l <= r)
//	    {
//	        m = (l + r) / 2;
//	        if (c[m] >= v)
//	        {
//	            r = m - 1;
//	        }
//	        else
//	        {
//	            l = m + 1;
//	        }
//	    }
//	    return r + 1;
//	}
	
	public static void main(String[] args) {
		int[] path = new int[input.length];
		int[] c = new int[input.length];
		
		int index = 0;
		c[index] = input[0];
		path[0] = 0;
		
		for (int i = 1; i < input.length; i++) {
			int cur = input[i];
			
			if(c[index] > cur) {
				c[index] = cur;
				path[i] = path[i-1];
			}else {
				c[++index] = cur;
				path[i] = i-1;
			}
			
			System.out.println("C    : " + Arrays.toString(c));
			System.out.println("path : " + Arrays.toString(path));
		}
	}
}
