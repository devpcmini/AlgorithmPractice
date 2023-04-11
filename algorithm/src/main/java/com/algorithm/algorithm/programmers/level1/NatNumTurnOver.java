package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class NatNumTurnOver {
	//자연수 뒤집어 배열로 만들기
	public static void main(String[] args) {
		long n = 12345;
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(long n) {
		String[] nStr = String.valueOf(n).split("");
        Collections.reverse(Arrays.asList(nStr));
		int[] answer = new int[nStr.length];
        for(int i=0; i<nStr.length; i++) {
        	answer[i] = Integer.parseInt(nStr[i]);
        }
        
        return answer;
    }
	
}
