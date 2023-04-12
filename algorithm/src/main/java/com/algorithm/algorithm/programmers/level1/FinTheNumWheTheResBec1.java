package com.algorithm.algorithm.programmers.level1;

public class FinTheNumWheTheResBec1 {
	//나머지가 1이 되는 수 찾기
	public static void main(String[] args) {
		int n = 10;
//		int n = 12;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<n; i++) {
        	if(n%i == 1 ) {
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
}
