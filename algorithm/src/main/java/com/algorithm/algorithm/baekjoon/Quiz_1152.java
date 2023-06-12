package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//단어의 개수
public class Quiz_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].equals("")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
