package com.algorithm.algorithm.programmers.level1;

public class SmallPartStr {
	//크기가 작은 부분문자열
	public static void main(String[] args) {
//		String t = "3141592";
//		String p = "271";
		String t = "500220839878";
		String p = "7";
		System.out.println(solution(t,p));
	}
	
	public static int solution(String t, String p) {
		int answer = 0;
		int tLen = t.length();
		int pLen = p.length();
		for(int i=0; i<=tLen-pLen; i++) {
			long tNum = Long.parseLong(t.substring(i, i+pLen));
			if(tNum <= Long.parseLong(p)) {
				answer++;
			}
		}
		return answer;
	}
}
