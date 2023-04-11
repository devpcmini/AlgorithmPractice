package com.algorithm.algorithm.programmers.level1;

public class DetTheSquRooOfAnInt {
	//정수 제곱근 판별
	public static void main(String[] args) {
		long n = 121;
//		long n = 3;
		System.out.println(solution(n)); 
	}
	
	public static long solution(long n) {
        long answer = 0;
        //제곱근 Math.sqrt
        //제곱 Math.pow
        if(!isInteger(Math.sqrt(n))) {
        	answer = -1;
        } else {
        	double squRoo = Math.sqrt(n) +1;
        	answer = (long)Math.pow(squRoo, 2);
        }
        return answer;
    }
	
	//정수인지 체크
	public static boolean isInteger(double num) {
		return num % 1 == 0.0;
	}
}
