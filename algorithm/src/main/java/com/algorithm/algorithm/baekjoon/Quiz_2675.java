package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문자열 반복
public class Quiz_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String answer = "";
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for(int j=0; j<str.length(); j++) {
				String plusStr = str.substring(j,j+1);
				for(int z=0; z<R; z++) {
					answer += plusStr;
				}
			}
			System.out.println(answer);
		}
	}
}
