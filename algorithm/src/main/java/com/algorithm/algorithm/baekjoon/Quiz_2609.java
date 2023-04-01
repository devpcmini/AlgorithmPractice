package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_2609 {
	/* 2609 : 최대공약수와 최소공배수
	 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에는 두 개의 자연수가 주어진다. "
				+ "이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N1 = Integer.parseInt(st.nextToken());
		int N2 = Integer.parseInt(st.nextToken());
		int max = divisor(N1,N2);
		int min = multiple(N1,N2);
		System.out.println("\n첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.\n");
		System.out.println(max);
		System.out.println(min);
	}
	
	//최대공약수
	//유클리드 호제법 사용
	static int divisor(int N1, int N2) {
		if(N1<N2) {
			int temp= N1;
			N1 = N2;
			N2 = temp;
		}
		while(N2 != 0) {
			int r = N1%N2;
			N1 = N2;
			N2 = r;
		}
		return N1;
	}
	
	//최소공배수
	static int multiple(int N1, int N2) {
		return (N1*N2)/divisor(N1,N2);
	}
}
