package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_2293 {
	/* 2293 : 동전 1
	n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 
	이 동전을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다. 그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다.
	사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에 n, k가 주어진다. (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000) 다음 n개의 줄에는 각각의 동전의 가치가 주어진다."
				+ " 동전의 가치는 100,000보다 작거나 같은 자연수이다.\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coin = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[K + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = coin[i]; j <= K; j++) {
                dp[j] = dp[j] + dp[j - coin[i]];
            }
        }
        System.out.println("\n첫째 줄에 경우의 수를 출력한다. 경우의 수는 231보다 작다.\n");
		System.out.println(dp[K]);
	}
}
