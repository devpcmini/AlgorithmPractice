package com.algorithm.algorithm.programmers.level1;

public class NumericStrAndEngWord {
	//숫자 문자열과 영단어
	public static void main(String[] args) {
		String s = "one4seveneight";
//		String s = "23four5six7";
//		String s = "2three45sixseven";
//		String s = "123";
		System.out.println(solution(s));
	}
	
//	public static int solution(String s) {
//		if(s.indexOf("zero") > -1) {
//			s = s.replace("zero", "0");
//		}
//		if(s.indexOf("one") > -1) {
//			s = s.replace("one", "1");
//		}
//		if(s.indexOf("two") > -1) {
//			s = s.replace("two", "2");
//		}
//		if(s.indexOf("three") > -1) {
//			s = s.replace("three", "3");
//		}
//		if(s.indexOf("four") > -1) {
//			s = s.replace("four", "4");
//		}
//		if(s.indexOf("five") > -1) {
//			s = s.replace("five", "5");
//		}
//		if(s.indexOf("six") > -1) {
//			s = s.replace("six", "6");
//		}
//		if(s.indexOf("seven") > -1) {
//			s = s.replace("seven", "7");
//		}
//		if(s.indexOf("eight") > -1) {
//			s = s.replace("eight", "8");
//		}
//		if(s.indexOf("nine") > -1) {
//			s = s.replace("nine", "9");
//		} 
//		return Integer.parseInt(s);
//	}
	public static int solution(String s) {
		String[] num = {"0","1","2","3","4","5","6","7","8","9"};
		String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0; i<num.length; i++) {
			s = s.replaceAll(word[i],num[i]);
		}
		return Integer.parseInt(s);
	}
}
