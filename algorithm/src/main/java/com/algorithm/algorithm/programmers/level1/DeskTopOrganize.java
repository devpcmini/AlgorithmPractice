package com.algorithm.algorithm.programmers.level1;

import java.util.Arrays;

public class DeskTopOrganize {
	public static void main(String[] args) {
//		String[] wallpaper = {".#...", "..#..", "...#."};
//		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//		String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
		String[] wallpaper = {"..", "#."};
		int[] answer = solution(wallpaper);
		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(String[] wallpaper) {
		int lux = wallpaper.length,luy = wallpaper[0].length(),rdx =0,rdy=0;
		for(int i=0; i<wallpaper.length; i++) {
			for(int j=0; j<wallpaper[i].length(); j++) {
				if(wallpaper[i].charAt(j) == '#') {
					lux = Math.min(lux, i);
					luy = Math.min(luy, j);
					rdx = Math.max(rdx, i);
					rdy = Math.max(rdy, j);
				}
			}
		}
		int[] answer = {lux,luy,rdx+1,rdy+1};
		return answer;
	}
}
