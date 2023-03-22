package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_2980 {
	/*
	2980 : 도로와 신호등
	상근이는 트럭을 가지고 긴 일직선 도로를 운전하고 있다. 도로에는 신호등이 설치되어 있다. 상근이는 각 신호등에 대해서 빨간 불이 지속되는 시간과 초록 불이 지속되는 시간을 미리 구해왔다. (빨강색과 초록색 불빛은 무한히 반복된다)
	
	상근이의 트럭이 도로에 진입했을 때, 모든 신호등의 색상은 빨간색이고, 사이클이 막 시작한 상태이다. 상근이는 1초에 1미터를 움직인다. 신호등의 색상이 빨간색인 경우에는 그 자리에서 멈추고 초록색으로 바뀔때 까지 기다린다.
	
	상근이가 도로의 끝까지 이동하는데 걸리는 시간을 구하는 프로그램을 작성하시오. 도로의 시작은 0미터이고, 끝은 L미터인 지점이다.
	 */
	static class drg {
		//위치
		int D;
		//빨간불
		int R;
		//파란불
		int G;
		public drg(StringTokenizer st) {
			super();
			this.D = Integer.parseInt(st.nextToken());
			this.R = Integer.parseInt(st.nextToken());
			this.G = Integer.parseInt(st.nextToken());
		}
	}
	public static void main(String[] args) throws IOException {
		
		System.out.println("첫째 줄에 신호등의 개수 N과 도로의 길이 L이 주어진다. (1 ≤ N ≤ 100, 1 ≤ L ≤ 1000)\r\n"
				+ "\r\n"
				+ "다음 N개 줄에는 각 신호등의 정보 D, R, G가 주어진다. (1 ≤ D < L, 1 ≤ R ≤ 100, 1 ≤ G ≤ 100) D는 신호등의 위치이며, R과 G는 빨간색, 초록색이 지속되는 시간이다.\r\n"
				+ "\r\n"
				+ "신호등은 D가 증가하는 순서로 주어지며, 같은 위치에 있는 신호등이 두 개 이상 있는 경우는 없다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		//신호등의 개수
		int N = Integer.parseInt(st1.nextToken());
		//도로길이
		int L = Integer.parseInt(st1.nextToken());
		
		int time = 0;
		int curPos = 0;
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			drg drg = new drg(st);
			
			//다음 위치까지 가는데 걸리는 시간
			time += drg.D - curPos; 
			curPos = drg.D;
			
			int section = time % (drg.R + drg.G);
			if(section < drg.R) {
				time += drg.R - section;
			}
		}
		System.out.println("\n\n첫째 줄에 상근이가 도로의 끝까지 이동하는데 걸리는 시간을 출력한다.\n" );
		//남은 신호등 거리 계산 포함
		System.out.println(time + L - curPos);
	}
}
