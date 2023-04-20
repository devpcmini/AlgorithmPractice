package com.algorithm.algorithm.programmers.level1;


public class StrHandDefault {
	//문자열 다루기 기본
	public static void main(String[] args) {
		String s = "a234";
//		String s = "1234";
		System.out.println(solution(s));
	}
	
	public static boolean solution(String s) {
		//내 풀이
		boolean answer = true;
		for(int i=0; i<s.length(); i++) {
			if((int)s.charAt(i) > 57 || (int)s.charAt(i) < 48) {
				answer = false;
			}
		}
		if(!(s.length() == 4 || s.length() == 6)) {
			answer = false;
		}
		return answer;
		
		//parseInt를 통한 문자열 체크
//		if(s.length() == 4 || s.length() == 6) {
//			try {
//				int x = Integer.parseInt(s);
//				return true;
//			} catch(NumberFormatException e) {
//				return false;
//			}
//			
//		} else {
//			return false;
//		}
		
		//정규식사용한 풀이
//        if (s.length() == 4 || s.length() == 6) {
//        	return s.matches("(^[0-9]*$)");
//        }
//        return false;
	}
}
