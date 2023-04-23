package com.algorithm.algorithm.programmers.level1;

public class CaesarPassword {
	//시저 암호
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		System.out.println(solution(s,n));
	}
	
	public static String solution(String s, int n) {
		String answer = "";
		for(int i=0; i<s.length(); i++) {
			int ascII = (int)s.charAt(i);
			if(ascII == 32) {
				answer = answer + " "; 
				continue;
			}else if(ascII <= 122 && ascII >= 97) {
				if(ascII+n > 122) {
					ascII = ascII-26;
				}
			} else if(ascII <= 90 && ascII >= 65) {
				if(ascII+n > 90) {
					ascII = ascII-26;
				}
			}
			answer = answer + (char)(ascII+n);
		}
		return answer;
	}
}
