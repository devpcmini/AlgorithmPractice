package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//팰린드롬인지 확인하기
public class Quiz_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = str.length();
		boolean result = true;
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len-i-1)){
				result = false;
			}
		}
		System.out.println(result ? 1 : 0);
	}
}
