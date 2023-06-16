package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//킹, 퀸, 룩, 비숍, 나이트, 폰
public class Quiz_3003 {
	static int[] arr = {1,1,2,2,2,8};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] - Integer.parseInt(st.nextToken()) + " ");
		}
	}
}
