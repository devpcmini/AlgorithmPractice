package com.algorithm.algorithm.programmers.level1;

public class AddTheNumOfDig {
	//자릿수 더하기
	public static void main(String[] args) {
		int n = 123;
//		int n = 987;
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
        int answer = 0;
        String[] arr = String.valueOf(n).split("");
        for(int i=0; i<arr.length; i++) {
        	answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
