class Solution {
    public String solution(String str1, String str2) {
    int count;
        StringBuilder answer = new StringBuilder();

        if (str1.length() >= str2.length()) {
            count = str1.length();
        } else {
            count = str2.length();
        }

        for(int i = 0 ; i<count; i++){
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }


        return answer.toString();
    }
    }
