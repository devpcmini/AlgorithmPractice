package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quiz_3085 {
	/*3085 : 사탕 게임
	상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.
	가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다. 
	상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다. 
	이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.
	사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.
	 */
	static int max = 1, N = 0;
	static char arr[][];
	
	public static void swap(int x1, int y1, int x2, int y2) { 
		char tmp = arr[x1][y1];
		arr[x1][y1] = arr[x2][y2];
		arr[x2][y2] = tmp; 
	}
	
	public static int chkRow(int x) { // 행 체크
		int tmp = 1, res = 1;
		char ch = arr[x][0];
		for(int i = 1; i < N; i++) {
			if(arr[x][i] != ch) {
				ch = arr[x][i];
				res = Math.max(res, tmp);
				tmp = 1;
			} else tmp++;
		}
		return Math.max(res,  tmp);
	}
	
	public static int chkCol(int y) { // 열 체크
		int tmp = 1, res = 1;
		char ch = arr[0][y];
		for(int i = 1; i < N; i++) {
			if(arr[i][y] != ch) {
				ch = arr[i][y];
				res = Math.max(res, tmp);
				tmp = 1;
			} else tmp++;
		}
		return Math.max(res, tmp);
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)\r\n"
				+ "\r\n"
				+ "다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.\r\n"
				+ "\r\n"
				+ "사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		for(int i = 0; i < N; i++) {
			String tmp = br.readLine();
			for(int j = 0; j < N; j++) {
				arr[i][j] = tmp.charAt(j);
			}
			max = Math.max(max, chkRow(i)); // swap하기 전 행 체크			
		}
		
		for(int i = 0; i < N; i++) max = Math.max(max, chkCol(i)); // swap하기 전 열 체크
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(j + 1 < N) { // 열 범위가 벗어나지 않을 때
					swap(i, j, i, j + 1); // 오른쪽이랑 swap
					max = Math.max(max, chkRow(i));
					max = Math.max(max, chkCol(j));
					max = Math.max(max, chkCol(j + 1));
					swap(i, j, i, j + 1); // 복귀
				}
				if(i + 1 < N) { // 행 범위가 벗어나지 않을 때
					swap(i, j, i + 1, j); // 아래쪽이랑 swap
					max = Math.max(max, chkRow(i));
					max = Math.max(max, chkRow(i + 1));
					max = Math.max(max, chkCol(j));
					swap(i, j, i + 1, j); // 복귀
				}
			}
		}
		System.out.println("\n첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.\n");
		System.out.println(max);
	}
}
