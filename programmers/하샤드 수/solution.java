// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12947

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0; // 자릿수의 합
        int n = x; // 나누기 위해 x 값을 저장해둔다.
        
        while(x != 0){ // x가 0이 될 때 까지 각 자릿수를 추출해 더해준다.
            sum+= x % 10;
            x /= 10;
        }
        
        // 나누어 떨어지면 하샤드 수
        if(n % sum == 0) return answer;
        // 아니면 false 반환.
        return false;
    }
}