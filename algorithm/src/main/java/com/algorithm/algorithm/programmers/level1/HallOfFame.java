package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfFame {
	//명예의 전당 (1)
	public static void main(String[] args) {
//		int k = 3;
//		int k = 4;
		int k = 9;
//		int[] score = {10,100,20,150,1,100,200};
//		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		int[] score = {10,30,40,3,0,20,4};
		System.out.println(Arrays.toString(solution(k,score)));
	}
	
	public static int[] solution(int k, int[] score) {
	    int[] answer = new int[score.length];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < score.length; i++) {
			queue.offer(score[i]);
			//큐에 길이가 k보다 클 경우
            if (queue.size() > k) {
            	//poll() 가장 작은 데이터를 뺀다.
            	queue.poll();
            }
            //peek() //가장 작은 데이터를 출력한다.
            answer[i] = queue.peek();
        }
		
		return answer;
	}
}
