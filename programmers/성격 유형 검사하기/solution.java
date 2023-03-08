// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/118666

import java.util.*;

public class Solution {
	
	//	성격 유형 검사하기
	
	static String[] typeArr = {"RT", "CF", "JM", "AN"};
	
	public static String typeCheck(HashMap<Character, Integer> hm) {
		
		StringBuilder sb = new StringBuilder();
		
		char firstChar;
		char secondChar;
		char typeChar;
		
		for (String s : typeArr) { // "RT", "CF", "JM", "AN"
			
			firstChar = s.charAt(0); // 'R', 'C', 'J', 'A'
			secondChar = s.charAt(1);// 'T', 'F', 'M', 'N'
			
			typeChar = hm.get(firstChar) >= hm.get(secondChar) ? firstChar : secondChar;
			
			sb.append(typeChar); // 'T' + 'C' + 'M' + 'A'
		}
		
		return sb.toString(); // "TCMA"
	}
	
	public static String solution(String[] survey, int[] choices) {
		String answer = "";
		int[] score = {0, 3, 2, 1, 0, -1, -2, -3}; // choices 값에 따라 점수 부여
		
		HashMap<Character, Integer> hm = new HashMap<>(); // 타입, 점수 담을 HashMap
		
		int scoreSum = 0; // 타입별 점수를 담을 변수
		
		for (String s : typeArr) { // "RT", "CF", "JM", "AN"
			hm.put(s.charAt(0), 0); // 'R' : 0, 'C' : 0, 'J' : 0 ,'A' : 0
			hm.put(s.charAt(1), 0); // 'T' : 0, 'F' : 0, 'M' : 0 ,'N' : 0
		}
		
		for (int i = 0; i < survey.length; i++) { // "AN", "CF", "MJ", "RT", "NA"
			// 'A' 스코어 // 'C' 스코어 // 'M' 스코어 // 'R' 스코어 // 'N' 스코어 업데이트
			scoreSum = hm.get(survey[i].charAt(0)) + score[choices[i]];
			hm.put(survey[i].charAt(0), scoreSum);
		}
		
		// 'R' : -3, 'C' : 1, 'J' : 0 ,'A' : -1
		// 'T' :  0, 'F' : 0, 'M' : 2 ,'N' : -1
		answer = typeCheck(hm);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"}; // survey 원소의 첫 글자를 기준으로 점수를 부여할 것이므로 score = {0, 3, 2, 1, 0, -1, -2, -3}으로 세팅
		int[] choices = {5, 3, 2, 7, 5}; // A : += score[5] // C : += score[3] // M : += score[2] // R : += score[7] // N : += score[5]
		
		System.out.println(solution(survey, choices));
	}
}