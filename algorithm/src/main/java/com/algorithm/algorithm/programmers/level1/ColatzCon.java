package com.algorithm.algorithm.programmers.level1;

public class ColatzCon {
	//콜라츠 추측
	public static void main(String[] args) {
//		int n = 6;
//		int n = 16;
		int n = 626331;
		System.out.println(solution(n));
	}
	
	public static int solution(int num) {
		int answer = 0;
		while(num != 1) {
			if(num%2 == 0) {
				num = num/2;
			} else if(num%2 == 1){
				num = num*3+1;
			}
			answer++;
			if(answer == 500) {
				answer = -1;
				break;
			}
		}
		return answer;
	}
}
