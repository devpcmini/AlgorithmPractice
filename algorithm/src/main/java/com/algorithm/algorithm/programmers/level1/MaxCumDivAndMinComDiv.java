package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;

public class MaxCumDivAndMinComDiv {
	//최대공약수와 최소공배수
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		int[] answer = new int[2];
		//최대공약수
		answer[0] = divisor(n,m);
		//최소공배수
		answer[1] = (n*m)/answer[0];
		System.out.println(Arrays.toString(answer));
	}
	
	//유클리드 호제법 사용
	static int divisor(int n, int m) {
		if(n<m) {
			int temp= n;
			n = m;
			m = temp;
		}
		while(m != 0) {
			int r = n%m;
			n = m;
			m = r;
		}
		return n;
	}
}
