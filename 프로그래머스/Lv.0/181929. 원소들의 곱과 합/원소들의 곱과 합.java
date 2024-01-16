class Solution {
   public int solution(int[] num_list) {
        if (num_list.length < 2) {
            // 배열의 길이가 2 미만인 경우에 대한 처리
            return 0;
        }

        int one = 1;
        int two = 0;

        // 배열의 곱과 합 계산
        for (int i = 0; i < num_list.length; i++) {
            two += num_list[i];
            one *= num_list[i];
        }

        // 곱이 합의 제곱보다 작으면 1을 반환, 그렇지 않으면 0을 반환
        if (one < (two * two)) {
            return 1;
        } else {
            return 0;
        }
    }
}