package com.algorithm.algorithm.programmers.level1;

public class CovYourCellPhoneNum {
	//핸드폰 번호 가리기
	public static void main(String[] args) {
//		String phone_number = "01033334444";
		String phone_number = "027778888";
		System.out.println(solution(phone_number));
	}
	public static String solution(String phone_number) {
		String answer ="";
		int len = phone_number.length();
		for(int i=0; i<len-4; i++) {
			answer = answer + "*";
		}
		answer = answer + phone_number.subSequence(len-4, len);
		return answer;
	}
}
