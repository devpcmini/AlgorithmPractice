package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz_2563 {
	/*2563 : 색종이
	가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
	예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.
	 */
	static int maxSize = 100;
	static int[][] arr = new int[maxSize][maxSize];
	static int N;
    public static void main(String[] args) throws IOException{
    	System.out.println("첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. "
			+ "색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, "
			+ "두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, "
			+ "색종이가 도화지 밖으로 나가는 경우는 없다\n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        // 4번 입력
        for(int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
	        int x1 = Integer.parseInt(st.nextToken());
	        int y1 = Integer.parseInt(st.nextToken());
	        
	        Square(x1,y1);
        }
        System.out.println("\n첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.\n");
        System.out.println(sum());
    }
    
    // 좌표값 저장
    public static void Square(int x1, int y1) {
    	for(int i = x1; i < x1+10; i++) {
    		for(int j = y1; j < y1+10; j++) {
    			arr[i][j] = 1;
    		}
    	}
    }
    
    // 총 넓이 계산
    public static int sum() {
    	int sum = 0;
        for(int i = 0; i < maxSize; i++) {
        	for(int j = 0; j < maxSize; j++) {
        		sum += arr[i][j];
        	}
        }
        return sum;
    }
}
