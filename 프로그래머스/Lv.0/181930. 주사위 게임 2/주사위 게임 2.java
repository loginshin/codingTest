class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a == b && b == c) {
            System.out.println(" all same");
            return answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (a == b || b == c || a == c) {
            System.out.println(" same 2");
            return answer = (a + b + c) * (a * a + b * b + c * c);
        } else {
            System.out.println(" all different");
            return answer = a + b + c;
        }
    }
}