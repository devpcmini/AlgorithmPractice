package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheStrAsIWant {
	//문자열 내 마음대로 정렬하기
	public static void main(String[] args) {
		String[] strings = {"sun","bed","car"};
		int n = 1;
		System.out.println(Arrays.toString(solution(strings,n)));
	}
	
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
	            @Override
	            public int compare(String o1, String o2) {
	                if (o1.charAt(n) > o2.charAt(n)) {
	                    return 1; //자기자신의 o1의 n번째 글짜가 o2의 n번쨰 글자보다 크다면 양수
	                } else if (o1.charAt(n) < o2.charAt(n)) {
	                    return -1; //자기자신의 o2의 n번째 글짜가 o1의 n번쨰 글자보다 크다면 음수
	                } else if (o1.charAt(n) == o2.charAt(n)) {
	                    return o1.compareTo(o2); //o1과 o2의 n번째 글자가 같으면 첫번째 글자 비교
	                }
	                return 0;
	            } 
	        }
		);
		return strings;
	}
	
//	public static String[] solution(String[] strings, int n) {
//		String[] answer = {};
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            arr.add("" + strings[i].charAt(n) + strings[i]);
//        }
//        Collections.sort(arr);
//        answer = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            answer[i] = arr.get(i).substring(1, arr.get(i).length());
//        }
//        return answer;
//	}
}
