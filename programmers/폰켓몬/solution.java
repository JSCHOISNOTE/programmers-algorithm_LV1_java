// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/1845

class Solution {
    public int solution(int[] nums) {
        int[] counts = new int[200001];
        // 1 ~ 200000 자연수이므로 배열 200001 을 만들어서 계속
        // 한마리도 없으면 ++
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(counts[nums[i]] == 0) {
                answer++;
            }
            counts[nums[i]]++;
        }
        // answer 가 크면 초기화
        if(answer > nums.length / 2) {
            answer = nums.length / 2;
        }
        return answer;
    }
}