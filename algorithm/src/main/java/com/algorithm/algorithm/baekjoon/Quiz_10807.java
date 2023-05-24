package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//개수 세기
public class Quiz_10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=0; i<N; i++) {
			int stI = Integer.parseInt(st.nextToken());
			if(stI == v) {
				result++;
			}
		}
		System.out.println(result);
	}
}
