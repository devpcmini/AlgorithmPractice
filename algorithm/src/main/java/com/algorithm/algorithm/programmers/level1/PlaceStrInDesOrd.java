package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class PlaceStrInDesOrd {
//	문자열 내림차순으로 배치하기
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		Arrays.sort(arr,Collections.reverseOrder());
		answer = String.join("",arr);
		
		return answer;
	}
}
