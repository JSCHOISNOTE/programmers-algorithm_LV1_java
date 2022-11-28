// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12912

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        
        for(int i = min ; i<=max; i++) {
            answer += i;
        }
        return answer;
    }
}