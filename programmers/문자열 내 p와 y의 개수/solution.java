// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12916

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        // 소문자로 변경
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == 'p')
                p++;
            else if (c == 'y')
                y++;
        }
        
        answer = p == y ? true : false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}