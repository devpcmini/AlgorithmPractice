package com.algorithm.algorithm.programmers.level1;

public class TernFlip {
	//3진법 뒤집기
	public static void main(String[] args) {
		int n = 45;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		String third = Integer.toString(n,3);
		String reverseStr = new StringBuffer(third).reverse().toString();
		return Integer.parseInt(reverseStr,3);
	}
}
