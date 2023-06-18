package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//문자와 문자열
public class Quiz_27866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int i = Integer.parseInt(br.readLine());
		System.out.println(S.charAt(i-1));
	}
}
