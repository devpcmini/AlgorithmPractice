package com.algorithm.algorithm.programmers.level1;

public class ACokeProblem {
	//콜라 문제
	public static void main(String[] args) {
//		int a = 2;
//		int b = 1;
//		int n = 20;
		int a = 3;
		int b = 1;
		int n = 20;
		System.out.println(solution(a,b,n));
	}
	
	public static int solution(int a, int b, int n) {
		int answer = 0;
		while(a <= n) {
			answer = answer + n/a*b;
			n = n - a*(n/a) + n/a*b;
		}
		return answer;
	}
	
//	public static int solution(int a, int b, int n) {
//		return (n > b ? n - b : 0) / (a - b) * b;
//	}
}
