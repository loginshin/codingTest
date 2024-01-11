class Solution {
      // 1. string을 분석한다
    // 2. "1"이 나오면 mode를 바꾼다.
    // 3. mode가 0이면 짝수만, mode가 1이면 홀수만 String 결과값에 추가한다.
//    public String solution(String code) {
//
//        String answer = "";
//        int mode = 0;
//
//        for(int i=0;i<code.length();i++){
//            System.out.println(i+"번째 문자 검색"+code.charAt(i));
//
//
//            //mode changer
//            if(code.charAt(i) == '1'){
//              if(mode ==0){
//                  mode=1;
//                  continue;
//              }else {
//                  mode=0;
//                  continue;
//              }
//            } else {
//                if(mode ==0){
//                    // i가 짝수일때 answer에 추가
//                    if(i%2==0){
//                     answer = answer + code.charAt(i);
//                     System.out.println(code.charAt(i)+"를 추가했습니다");
//                     System.out.println("answer = "+answer);
//                     continue;
//                    }else {
//                        continue;
//                    }
//                }else if(mode ==1){
//                    // i가 홀 수 일때 answer에 추가
//                    if(i%2!=0){
//                        answer = answer + code.charAt(i);
//                        System.out.println(code.charAt(i)+"를 추가했습니다");
//                        System.out.println("answer = "+answer);
//                        continue;
//                    }else {
//                        continue;
//                    }
//
//                }
//            }
//
//        }
//
//        return answer;
//    }
        public String solution(String code) {
            StringBuilder answerBuilder = new StringBuilder();
            int mode = 0;

            for (int i = 0; i < code.length(); i++) {
                char currentChar = code.charAt(i);

                // mode changer
                if (currentChar == '1') {
                    mode = 1 - mode;  // mode를 0과 1 사이에서 전환
                    continue;
                }

                // mode에 따른 문자 추가
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 != 0)) {
                    answerBuilder.append(currentChar);
                }
            }

            String answer = answerBuilder.toString();

            if (answer.isEmpty()) {
                return "EMPTY";
            }
            return answer;
        }
}