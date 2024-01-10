class Solution {
  public int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n < m ? 1 : 0;
            }
        } else if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n > m ? 1 : 0;
            }
        }
        // 잘못된 입력이 들어오면 0 반환
        return 0;
    }
}