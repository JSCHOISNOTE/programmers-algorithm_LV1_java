// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12901

import java.time.*;
class Solution {
  public String solution(int a, int b) {
      // https://velog.io/@hong-brother/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-2016%EB%85%84JAVA-LEVEL1 참고
      return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
  }
}
