class Solution {
    public int solution(int a, int b) {
        String result ="";
        int answer;
        int left = Integer.parseInt(a+""+b);
        int right = 2*a*b;
        if(left>right){
            answer = left;
        }else if (right>left){
            result = (b+""+a);
            answer = right;
        }else {
            answer = left;
        }
        return answer;
    }
}