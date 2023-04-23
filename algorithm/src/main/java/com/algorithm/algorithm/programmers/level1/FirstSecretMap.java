package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;

public class FirstSecretMap {
	//[1차] 비밀지도
	public static void main(String[] args) {
//		int n = 5;
//		int[] arr1 = {9,20,28,18,11};
//		int[] arr2 = {30,1,21,17,28};
		int n = 6;
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		System.out.println(Arrays.toString(solution(n,arr1,arr2)));
	}
	
	public static String[] solution(int n,int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for(int i=0; i<n; i++) {
			String str1 = rtnVal(n,arr1[i]);
			String str2 = rtnVal(n,arr2[i]);
			String answerStr = "";
			for(int j=0; j<str1.length(); j++) {
				answerStr += str1.charAt(j) == '1' || str2.charAt(j) == '1' ? "#" : " ";
			}
			answer[i] = answerStr;
		}
		return answer;
	}
	
	public static String rtnVal(int n,int num) {
		String binary = Integer.toBinaryString(num);
		String str = "0".repeat(n-binary.length()) + binary;
		return str;
	}
}
