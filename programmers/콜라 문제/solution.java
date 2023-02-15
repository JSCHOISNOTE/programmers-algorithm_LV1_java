// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/132267

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            // 빈 병 수가 a 개 보다 미만이면 return
            if(n < a ){
                break;
            }
            
            answer += (n / a ) * b ;
            int remain = n % a ;
            
            n = (n / a ) * b + remain;
        }
        return answer;
    }
}