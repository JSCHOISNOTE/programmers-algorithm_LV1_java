// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12921

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; ++i) {
            if (arr[i] == 1) continue;
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 1;
            }
            ++answer;
        }

        return answer;
    }
}