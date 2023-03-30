package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_1063 {
	/*
	1063 : 킹
	8*8크기의 체스판에 왕이 하나 있다. 킹의 현재 위치가 주어진다. 체스판에서 말의 위치는 다음과 같이 주어진다. 알파벳 하나와 숫자 하나로 이루어져 있는데, 알파벳은 열을 상징하고, 숫자는 행을 상징한다. 열은 가장 왼쪽 열이 A이고, 가장 오른쪽 열이 H까지 이고, 행은 가장 아래가 1이고 가장 위가 8이다. 예를 들어, 왼쪽 아래 코너는 A1이고, 그 오른쪽 칸은 B1이다.
	
	킹은 다음과 같이 움직일 수 있다.
	
	R : 한 칸 오른쪽으로
	L : 한 칸 왼쪽으로
	B : 한 칸 아래로
	T : 한 칸 위로
	RT : 오른쪽 위 대각선으로
	LT : 왼쪽 위 대각선으로
	RB : 오른쪽 아래 대각선으로
	LB : 왼쪽 아래 대각선으로
	체스판에는 돌이 하나 있는데, 돌과 같은 곳으로 이동할 때는, 돌을 킹이 움직인 방향과 같은 방향으로 한 칸 이동시킨다. 아래 그림을 참고하자.
	
	입력으로 킹이 어떻게 움직여야 하는지 주어진다. 입력으로 주어진 대로 움직여서 킹이나 돌이 체스판 밖으로 나갈 경우에는 그 이동은 건너 뛰고 다음 이동을 한다.
	
	킹과 돌의 마지막 위치를 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에 킹의 위치, 돌의 위치, 움직이는 횟수 N이 주어진다. 둘째 줄부터 N개의 줄에는 킹이 어떻게 움직여야 하는지 주어진다. "
				+ "N은 50보다 작거나 같은 자연수이고, 움직이는 정보는 위에 쓰여 있는 8가지 중 하나이다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String king = st.nextToken();
		String stone = st.nextToken();
		int N = Integer.parseInt(st.nextToken());
		String input = "";
		String bfKing = ""; 
		String bfStone = ""; 
		for(int i = 0; i<N; i++ ) {
			input = br.readLine();
			bfKing = king;
			king = replace(king,input);
			if(stone.equals(king)) {
				bfStone = stone;
				stone = replace(stone,input);
				if(stone.equals(bfStone)) {
					king = bfKing;
				}
			}
		}
		System.out.println("\n첫째 줄에 킹의 마지막 위치, 둘째 줄에 돌의 마지막 위치를 출력한다.\n");
		System.out.println(king);
		System.out.println(stone);
	}
	
	private static String replace(String rtnValue, String input) {
		String result = "";
		char rtnValue1 = rtnValue.charAt(0);
		int rtnValue2 = Integer.parseInt(rtnValue.substring(1));
		switch(input) {
			case "R" : result = String.valueOf((char)((int)rtnValue1+1)) + rtnValue2; break;
			case "L" : result = String.valueOf((char)((int)rtnValue1-1)) + rtnValue2; break;
			case "B" : result = Character.toString(rtnValue1) + (rtnValue2-1); break;
			case "T" : result = Character.toString(rtnValue1) + (rtnValue2+1); break; 
			case "RT" : result = String.valueOf((char)((int)rtnValue1+1)) + (rtnValue2+1); break;
			case "LT" : result = String.valueOf((char)((int)rtnValue1-1)) + (rtnValue2+1); break;
			case "RB" : result = String.valueOf((char)((int)rtnValue1+1)) + (rtnValue2-1); break;
			case "LB" : result = String.valueOf((char)((int)rtnValue1-1)) + (rtnValue2-1); break;
		}
		if((int)result.charAt(0) < 65 || (int)result.charAt(0) > 72) {
			return rtnValue;
		} else if((int)result.charAt(1) < 49 || (int)result.charAt(1) > 56){
			return rtnValue;
		} else {
			return result;
		}
	}
}
