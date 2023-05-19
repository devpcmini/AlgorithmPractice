package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//주사위 세개
public class Quiz_2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] scan = {A, B, C};
		int count = 0;
		int duplication = 0;
		for(int i=0; i<scan.length; i++) {
			int tempC = 0;
			int tempD = 0;
			for(int j=i+1; j<scan.length; j++) {
				if(scan[i] == scan[j]) {
					tempD = scan[i];
					tempC++;
				}
			}
			if(count < tempC) {
				count = tempC;
				duplication = tempD;
			}
		}
		switch(count) {
			case 0 : Arrays.sort(scan); System.out.println(scan[2]*100); break;
			case 1 : System.out.println(1000 + (duplication*100));break;
			case 2 : System.out.println(10000 + (duplication*1000));break;
		}
		
	}
}
