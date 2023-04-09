package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Quiz_1911 {
	/* 1911 : 흙길
	 어젯밤 겨울 캠프 장소에서 월드 본원까지 이어지는, 흙으로 된 비밀길 위에 폭우가 내려서 N (1 <= N <= 10,000) 개의 물웅덩이가 생겼다. 
	 월드학원은 물웅덩이를 덮을 수 있는 길이 L (L은 양의 정수) 짜리 널빤지들을 충분히 가지고 있어서, 이들로 다리를 만들어 물웅덩이들을 모두 덮으려고 한다. 
	 물웅덩이들의 위치와 크기에 대한 정보가 주어질 때, 모든 물웅덩이들을 덮기 위해 필요한 널빤지들의 최소 개수를 구하여라.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에 N과 L이 들어온다.\r\n"
				+ "둘째 줄부터 N+1번째 줄까지 총 N개의 줄에 각각의 웅덩이들의 정보가 주어진다. "
				+ "웅덩이의 정보는 웅덩이의 시작 위치와 끝 위치로 이루어진다. 각 위치는 0이상 1,000,000,000이하의 정수이다.\n");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());	// 웅덩이 개수
		int L = Integer.parseInt(st.nextToken());	// 널빤지 길이
		int[][] arr = new int[N][2];	// 물 웅덩이 시작, 끝위치
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int []>() {
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0])
					return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		int nulpan = 0;	// 필요한 널빤지의 개수
		int range = 0;	// 널빤지를 물웅덮이에 덮었을때, 덮을 수 있는 범위
		for(int i=0; i<N; i++) {
			if(arr[i][0] > range)
				range = arr[i][0];
			if(arr[i][1] >= range) {
				while(arr[i][1] > range) {
					range += L;
					nulpan ++;
				}
			}
		}
		System.out.println("\n첫째 줄에 모든 물웅덩이들을 덮기 위해 필요한 널빤지들의 최소 개수를 출력한다.\n");
		System.out.println(nulpan);
	}

}