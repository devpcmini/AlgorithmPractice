package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//직사각형에서 탈출
public class Quiz_1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		if(x == 1 || y == 1) {
			System.out.println("1");
			return;
		}
		int result = w - x;
		result = result > h - y ? h - y : result;
		if(result == 1) {
			System.out.println("1");
			return;
		} else {
			result = result > x ? x : result;
			result = result > y ? y : result;
			result = result > w ? w : result;
			result = result > h ? h : result;
		}
		System.out.println(result);
	}
}
