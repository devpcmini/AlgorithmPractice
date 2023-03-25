package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_16943 {
	/* 16943 : 숫자
	두 정수 A와 B가 있을 때, A에 포함된 숫자의 순서를 섞어서 새로운 수 C를 만들려고 한다. 즉, C는 A의 순열 중 하나가 되어야 한다. 
	가능한 C 중에서 B보다 작으면서, 가장 큰 값을 구해보자. C는 0으로 시작하면 안 된다.
	 */
	static String A;
	static int B,C;
	static int[] aArray;
	
	public static void solution(int nowNum, int i, int len, boolean[] visited) {
        if (i == len) {
            C = Math.max(C, nowNum);
            return;
        }
        for (int j = 0; j < len; j++) {
            if (visited[j] || (aArray[j] == 0 && i == 0)) {
                continue;
            }
            if (nowNum * 10 + aArray[j] > B) {
                continue;
            }
            visited[j] = true;
            solution(nowNum * 10 + aArray[j], i + 1, len, visited);
            visited[j] = false;
        }
    }
	
	public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에 두 정수 A와 B가 주어진다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = st.nextToken();
		int len = A.length();
		aArray = new int[len];
		B = Integer.parseInt(st.nextToken());
		C = -1;
		boolean[] visited = new boolean[len];
		for(int i=0; i<len; i++) {
			aArray[i] = A.charAt(i) - '0';
		}
		solution(0,0,len,visited);
		System.out.println("\nB보다 작은 C중에서 가장 큰 값을 출력한다. 그러한 C가 없는 경우에는 -1을 출력한다.\n");
		System.out.println(C);
	}
}
