package com.algorithm.algorithm.programmers.level1;

public class NumOfPAndYInAStr {
	//문자열 내 p와 y의 개수
	public static void main(String[] args) {
//		String s = "pPoooyY";
		String s = "Pyy";
		System.out.println(solution(s));
	}
	static boolean solution(String s) {
        boolean answer = true;
        String upperS = s.toUpperCase();
        int pCnt = 0;
        int yCnt = 0;
        for(int i=0; i<upperS.length(); i++) {
        	if(upperS.charAt(i) == 'P') {
        		pCnt++;
        	} else if(upperS.charAt(i) == 'Y') {
        		yCnt++;
        	}
        }
        
        if(pCnt == 0 && yCnt == 0) {
        	answer = true;
        } else if(pCnt == yCnt) {
        	answer = true;
        } else {
        	answer = false;
        }

        return answer;
    }
}
