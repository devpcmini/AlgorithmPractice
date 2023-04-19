package com.algorithm.algorithm.programmers.level1;

public class TheNumAndAddOfMinWater {
	// 약수의 개수와 덧셈
	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		System.out.println(solution(left, right));
	}

	public static int solution(int left, int right) {
		int answer = 0;
		for(int i=left; i<=right; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count%2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		return answer;
	}
}
