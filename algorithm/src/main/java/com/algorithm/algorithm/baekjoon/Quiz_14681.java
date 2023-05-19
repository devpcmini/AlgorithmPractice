package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//사분면 고르기 
public class Quiz_14681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		if(X > 0 && Y > 0) {
			System.out.println("1");
		} else if(X < 0 && Y > 0) {
			System.out.println("2");
		} else if(X < 0 && Y < 0) {
			System.out.println("3");
		} else if(X > 0 && Y < 0) {
			System.out.println("4");
		}
	}
}
