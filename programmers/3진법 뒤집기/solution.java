// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/68935

import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        // 10진법 -> N진법 
        // Integer.toBinaryString(number); // 2진법
        //Integer.toOctalString(number); // 8진법
        //Integer.toHexString(number); // 16진법
        String ans = "";
        while(n != 0) {
            ans += n%3;
            n /= 3;
        }
        return Integer.parseInt(ans, 3);
    }
}