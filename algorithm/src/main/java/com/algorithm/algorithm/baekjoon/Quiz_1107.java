package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_1107 {
	/* 1107 : 리모컨
	수빈이는 TV를 보고 있다. 수빈이는 채널을 돌리려고 했지만, 버튼을 너무 세게 누르는 바람에, 일부 숫자 버튼이 고장났다.
	리모컨에는 버튼이 0부터 9까지 숫자, +와 -가 있다. +를 누르면 현재 보고있는 채널에서 +1된 채널로 이동하고, -를 누르면 -1된 채널로 이동한다. 
	채널 0에서 -를 누른 경우에는 채널이 변하지 않고, 채널은 무한대 만큼 있다.
	수빈이가 지금 이동하려고 하는 채널은 N이다. 어떤 버튼이 고장났는지 주어졌을 때, 
	채널 N으로 이동하기 위해서 버튼을 최소 몇 번 눌러야하는지 구하는 프로그램을 작성하시오. 
	수빈이가 지금 보고 있는 채널은 100번이다.
	 */
	static boolean[] broken = new boolean[10];
	static final int target = 0, bNum = 0;
    public static void main(String[] args) throws IOException {
		System.out.println("첫째 줄에 수빈이가 이동하려고 하는 채널 N (0 ≤ N ≤ 500,000)이 주어진다.  "
				+ "둘째 줄에는 고장난 버튼의 개수 M (0 ≤ M ≤ 10)이 주어진다. "
				+ "고장난 버튼이 있는 경우에는 셋째 줄에는 고장난 버튼이 주어지며, 같은 버튼이 여러 번 주어지는 경우는 없다.\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());
        int bNum = Integer.parseInt(br.readLine());
        if (bNum != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < bNum; i++) {
                int num = Integer.parseInt(st.nextToken());
                broken[num] = true;
            }
        }

        int result = Math.abs(target - 100);    // +,- 로만 누르는 경우
        for (int i = 0; i <= 1000000; i++) {
            int len = check(i);   // 숫자버튼 누르는 횟수
            if (len > 0) {
                int press = Math.abs(target - i);  // +,- 버튼 누르는 횟수
                result = Math.min(result, len + press);   // 최소 이동 횟수 계산
            }
        }
		System.out.println("\n첫째 줄에 채널 N으로 이동하기 위해 버튼을 최소 몇 번 눌러야 하는지를 출력한다.\n");
        System.out.println(result);
    }

    static int check(int n) {
        if (n == 0) {
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int len = 0;
        while (n > 0) {
            if (broken[n % 10]) {   // 고장난 버튼이 있는 경우
                return 0;
            }
            n /= 10;
            len += 1;   // 숫자버튼 누르는 횟수 증가
        }
        return len;
    }
}
