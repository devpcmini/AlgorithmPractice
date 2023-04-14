package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class PlaIntInDesOrd {
	//정수 내림차순으로 배치하기
	public static void main(String[] args) {
		long n = 118372;
		System.out.println(solution(n));
	}
	
	public static long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        //내림차순정렬
        Collections.sort(Arrays.asList(arr),Collections.reverseOrder());
        answer = Long.parseLong(String.join("", arr));
        return answer;
    }
}
