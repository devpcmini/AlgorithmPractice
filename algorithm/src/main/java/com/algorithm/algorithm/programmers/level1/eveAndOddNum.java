package com.algorithm.algorithm.programmers.level1;

public class eveAndOddNum {
	
	public static void main(String[] args) {
		int num = 3;
//		int num = 4;
		System.out.println(solution(num));
	}
	
	public static String solution(int num) {
        String answer = "";
        if(num%2 == 1 || num%2 == -1) {
			answer = "Odd";
		} else if(num == 0) {
            answer = "Even";
        } else if(num%2 == 0){
			answer = "Even";
		} 
        return answer;
    }
	
}
