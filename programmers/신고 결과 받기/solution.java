// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/92334

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// 중속 신고를 제거하기 위해 HashMap, HashSet 을 사용
class Solution {
	public static int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = {};
	        answer = new int[id_list.length];

        // [신고된ID, [신고한ID]]
		Map<String, HashSet<String>> reportedMap = new HashMap<>();
        // [신고된Id, 메일 수]
		Map<String, Integer> answerMap = new HashMap<>(); 

		
		// 초기화
		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> reportingId = new HashSet<>(); // 신고한ID
			reportedMap.put(id_list[i], reportingId); // 유저ID, 신고한ID 초기 세팅
			answerMap.put(id_list[i], 0);  // 메일 수는 모두 0 으로 초기화
		}
		
		for (String s : report) {
			String[] reportStr = s.split(" ");
			String reportingID = reportStr[0]; // 신고한ID
			String reportedID = reportStr[1]; // 신고된ID
			reportedMap.get(reportedID).add(reportingID); 
            // 신고된ID 를 key 값으로 신고한ID 배열을 value 로 새팅
		}

		// 유저가 받을 이용정지메일 
        // reportedUser 는 신고된ID유저
		for (String reportedUser : reportedMap.keySet()) { 
            // reportedUser(신고된유저)를 신고한 유저
			HashSet<String> userForSend = reportedMap.get(reportedUser);
            // reportedUser(신고된유저)를 신고한 유저
			if (userForSend.size() >= k) { 
				for (String userId : userForSend) {
					answerMap.put(userId, answerMap.get(userId) + 1); 
				}
			}
		}

		// 아이디별 받은 메일 수 
		for (int i = 0; i < id_list.length; i++) {
			answer[i] = answerMap.get(id_list[i]);
		}

		return answer;
	}

}