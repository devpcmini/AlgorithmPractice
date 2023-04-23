package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;

public class AMinRec {
	//최소직사각형
	public static void main(String[] args) {
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		System.out.println(solution(sizes));
	}
	
	public static int solution(int[][] sizes) {
		int x = 0;
		int y = 0;
		for(int i=0; i<sizes.length; i++) {
			Arrays.sort(sizes[i]);
			x = x < sizes[i][0] ? sizes[i][0] : x;
			y = y < sizes[i][1] ? sizes[i][1] : y;
		}
		return x * y;
	}
}
