package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//너의 평점은
public class Quiz_25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double score = 0.0;
		double grade = 0.0;
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			double hj = Double.parseDouble(st.nextToken());
			String dg = st.nextToken();
			if(!dg.equals("P")) {
				score += hj;
				double dDg = hjCheck(dg);
				if(!dg.equals("P") || !dg.equals("F")) {
					grade += (hj * dDg);
				}
			}
		}
		System.out.println(Math.round((grade / score)* 1000000) / 1000000.0);
	}
	
	public static double hjCheck(String dg) {
		double result = 0.0;
		switch(dg) {
			case "A+" : result = 4.5; break;
			case "A0" : result = 4.0; break;
			case "B+" : result = 3.5; break;
			case "B0" : result = 3.0; break;
			case "C+" : result = 2.5; break;
			case "C0" : result = 2.0; break;
			case "D+" : result = 1.5; break;
			case "D0" : result = 1.0; break;
			case "F" :  result = 0.0; break;
		}
		return result;
	}
}
