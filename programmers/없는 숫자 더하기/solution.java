// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/86051

public class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        // 0~9 니깐 45에서 있는 숫자 빼기로 해결
        for (int n : numbers) {
            answer -= n;
        }

        return answer;
    }
}