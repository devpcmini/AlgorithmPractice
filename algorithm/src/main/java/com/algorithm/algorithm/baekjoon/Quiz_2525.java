package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//오븐 시계
public class Quiz_2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		int rtnHour = (A  + ((B + C)/60)) >= 24 ? (A  + ((B + C)/60)) - 24 : (A  + ((B + C)/60));
		int rtnMin = (B + C)%60;
		System.out.println(rtnHour + " " + rtnMin);
	}
}
