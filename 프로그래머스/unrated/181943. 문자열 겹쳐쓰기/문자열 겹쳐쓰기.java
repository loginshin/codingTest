class Solution {
     public String solution(String my_string, String overwrite_string, int s) {
     // for(int i = 0; i <my_string.length();i++){
//            if(i == s ){
//                System.out.printf(overwrite_string);
//                i= s+overwrite_string.length()-1;
//                continue;
//
//            }
//            System.out.printf(String.valueOf(my_string.charAt(i)));
//
//        }
//        return "";

        // 결과 문자열을 저장할 StringBuilder 생성
        StringBuilder result = new StringBuilder();

        // s 인덱스 이전의 문자열을 결과에 추가
        result.append(my_string.substring(0, s));

        // overwrite_string을 결과에 추가
        result.append(overwrite_string);

        // s 인덱스 + overwrite_string의 길이 이후의 문자열을 결과에 추가
        result.append(my_string.substring(s + overwrite_string.length()));

        // StringBuilder를 String으로 변환하여 반환
        return result.toString();

    }
}