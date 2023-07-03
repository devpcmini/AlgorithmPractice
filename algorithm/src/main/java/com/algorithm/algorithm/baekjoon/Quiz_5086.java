package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//배수와 약수
public class Quiz_5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if(A == 0 && B == 0) {
				break;
			}
			
			if(A > B) {
				if(A % B == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			} else {
				boolean flag = false;
				for(int i=1; i<=B; i++) {
					if(B % i == 0) {
						if(i == A) {
							flag = true;
						}
					}
				}
				if(flag) {
					System.out.println("factor");
				}
			}
			
		}
	}
}
