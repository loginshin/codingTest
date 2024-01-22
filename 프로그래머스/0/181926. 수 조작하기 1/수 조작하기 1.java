class Solution {
    public int solution(int n, String control) {
        // control 문자열을 순회하면서 n을 변화시킴
        for (char cmd : control.toCharArray()) {
            switch (cmd) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        // 최종 결과 반환
        return n;
    }
}
