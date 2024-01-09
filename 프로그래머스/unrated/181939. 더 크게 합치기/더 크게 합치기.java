class Solution {
 public int solution(int a, int b) {
      //        String result ="";
//        String answer;
//
//        if(a>b){
//            result = (a+""+b);
//            answer = result;
//        }else if (b>a){
//            result = (b+""+a);
//            answer = result;
//        }else {
//            answer = "";
//        }
//        return Integer.parseInt(answer);

        String ab = Integer.toString(a) + Integer.toString(b);  // a와 b를 문자열로 변환 후 연결
        String ba = Integer.toString(b) + Integer.toString(a);  // b와 a를 문자열로 변환 후 연결

        return Math.max(Integer.parseInt(ab), Integer.parseInt(ba));
    }
}