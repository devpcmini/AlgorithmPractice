package com.algorithm.algorithm.programmers.level1;

public class CalTheShort {
	//부족한 금액 계산하기
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price,money,count));
	}
	
	public static long solution(int price, int money, int count) {
		long sum = 0;
		for(int i=1; i<=count; i++) {
			sum += price * i;
		}
		return sum <= money ? 0 : sum - money;
	}
}
