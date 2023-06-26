package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//진법 변환
public class Quiz_2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int N = Integer.parseInt(st.nextToken());
		int temp = 1;
		int ans = 0;
		for(int i=s.length()-1; i >= 0; i--) {
			char c = s.charAt(i);
			if('A' <= c && c <= 'Z') {
				ans += (c-'A'+10)*temp;
			} else {
				ans += (c-'0')*temp;
			}
			temp *= N;
		}
		System.out.println(ans);
	}
}
