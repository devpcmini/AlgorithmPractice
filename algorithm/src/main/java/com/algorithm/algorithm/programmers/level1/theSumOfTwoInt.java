package com.algorithm.algorithm.programmers.level1;

public class theSumOfTwoInt {
	//두 정수 사이의 합
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
//		int a = 3;
//		int b = 3;
//		int a = 5;
//		int b = 3;
		System.out.println(solution(a,b));
	}
	
	public static long solution(int a, int b) {
		long answer = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i=a; i<=b; i++) {
			answer += i;
		}
		return answer;
	}
}
