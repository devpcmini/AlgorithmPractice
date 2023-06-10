package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//다이얼
public class Quiz_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		int answer = 0;
		for(int i=0; i<arr.length; i++) {
			if("ABC".indexOf(arr[i]) > -1) {
				answer = answer + 3;
			} else if("DEF".indexOf(arr[i]) > -1) {
				answer = answer + 4;
			} else if("GHI".indexOf(arr[i]) > -1) {
				answer = answer + 5;
			} else if("JKL".indexOf(arr[i]) > -1) {
				answer = answer + 6;
			} else if("MNO".indexOf(arr[i]) > -1) {
				answer = answer + 7;
			} else if("PQRS".indexOf(arr[i]) > -1) {
				answer = answer + 8;
			} else if("TUV".indexOf(arr[i]) > -1) {
				answer = answer + 9;
			} else if("WXYZ".indexOf(arr[i]) > -1) {
				answer = answer + 10;
			} else {
				answer = answer + 0;
			}
		}
		System.out.println(answer);
	}
}
