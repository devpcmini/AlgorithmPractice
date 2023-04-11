package com.algorithm.algorithm.programmers.level1;

public class ToFinTheAve {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
//		int[] arr = {5,5};
		System.out.println(solution(arr));
	}
	
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }
}
