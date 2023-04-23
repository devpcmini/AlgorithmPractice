package com.algorithm.algorithm.programmers.level1;

public class CreateStrChar {
	//이상한 문자 만들기
	public static void main(String[] args) {
		String s = "abc abcd abcde";
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		String answer = "";
		//내 풀이
		/*String[] arr = s.split(" ",-1);
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == "") continue;
			String str = arr[i].toUpperCase();
			System.out.println(str);
			for(int j=0; j<str.length(); j++) {
				String strJ = String.valueOf(str.charAt(j));
				if(j%2 == 1) {
					answer += strJ.toLowerCase();
				} else {
					answer += strJ;
				}
			}
			if(i+1 != arr.length) {
				answer += " ";
			}
		}*/
		int cnt = 0;
		String[] array = s.split("");
		for(String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt +1;
			answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
	}
}
