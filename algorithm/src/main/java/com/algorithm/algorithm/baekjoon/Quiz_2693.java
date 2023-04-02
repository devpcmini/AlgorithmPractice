package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Quiz_2693 {
	/*2693 : N번째 큰 수
	 * 배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
	 * 배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. "
				+ "각 테스트 케이스는 한 줄로 이루어져 있고, 배열 A의 원소 10개가 공백으로 구분되어 주어진다. "
				+ "이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			biggerN(br.readLine());
		}
	}
	
	public static void biggerN(String br) {
		StringTokenizer st = new StringTokenizer(br);
		ArrayList<Integer> arr = new ArrayList<>();
		while(st.hasMoreTokens()) {
			int i = 0;
			arr.add(i,Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		System.out.println(arr.get(arr.size()-3));
	}
}
