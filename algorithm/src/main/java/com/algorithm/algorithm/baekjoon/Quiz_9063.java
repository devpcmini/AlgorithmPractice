package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//대지
public class Quiz_9063 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int xMax = Integer.MIN_VALUE;
		int xMin = Integer.MAX_VALUE;
		int yMax = Integer.MIN_VALUE;
		int yMin = Integer.MAX_VALUE;
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			xMax = xMax < x ? x : xMax;
			xMin = xMin < x ? xMin : x;
			yMax = yMax < y ? y : yMax;
			yMin = yMin < y ? yMin : y;
		}
		System.out.println((xMax - xMin) * (yMax - yMin));
		
	}
}
