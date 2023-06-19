package com.algorithm.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//크로아티아 알파벳 
public class Quiz_2941 {
	static String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        String[] array = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String replacement = "";

        // 정규식 패턴 생성
        String regex = String.join("|", array);
        Pattern pattern = Pattern.compile(regex);

        // Matcher를 사용하여 replace와 개수 카운트
        Matcher matcher = pattern.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        int replacedCount = 0;
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, replacement);
            replacedCount++;
        }
        matcher.appendTail(stringBuffer);

        String replacedStr = stringBuffer.toString();
        System.out.println(replacedCount + replacedStr.length());
	}
}
