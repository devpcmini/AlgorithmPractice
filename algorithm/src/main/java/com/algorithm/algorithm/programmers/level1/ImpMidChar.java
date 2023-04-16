package com.algorithm.algorithm.programmers.level1;

public class ImpMidChar {
	//가운데 글자 가져오기
	public static void main(String[] args) {
//		String s = "abcde";
		String s = "qwer";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
//		String[] strArr = s.split("");
//		int len = strArr.length;
//		return strArr.length%2 == 1 ? strArr[len/2] : strArr[len/2-1] + strArr[len/2];
		return s.substring((s.length()-1)/2 , s.length()/2 + 1);
	}
}
