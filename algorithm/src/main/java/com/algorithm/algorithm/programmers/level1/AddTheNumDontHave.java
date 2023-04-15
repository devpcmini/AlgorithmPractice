package com.algorithm.algorithm.programmers.level1;

public class AddTheNumDontHave {
	//없는 숫자 더하기
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
//		int[] numbers = {5,8,4,0,6,7,9};
		System.out.println(solution(numbers));
	}
	
	public static int solution(int[] numbers) {
		int answer = 45;
		for(int i : numbers) {
			answer -= i;
		}
		return answer;
	}
}
