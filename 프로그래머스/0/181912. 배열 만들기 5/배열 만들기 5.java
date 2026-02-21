class Solution {
    /**
    *  1. intStrs를 순회하며 s index 부터 i length 만큼 잘라 Integer type 으로 바꾼다.
    *  2. 바꾼 숫자를 k와 비교해서 k보다 크다면 anwer 배열에 push 한다.
    */
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};

        for (int i = 0; i < intStrs.length; i ++) {
            String tmp = "";
            for (int j = s; j < s+l; j++) {
                tmp = tmp + intStrs[i].charAt(j);
            }

            if (Integer.parseInt(tmp) > k) {
                answer = addArray(answer, Integer.parseInt(tmp));
            }
        }

        for (int p = 0; p < answer.length; p++) {
            System.out.println(answer[p]);
        }
        
        return answer;
    }

    // 배열 추가 메서드
    static int[] addArray(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = value;

        return newArr;
    }
}