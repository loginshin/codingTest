import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
              List<Integer> resultList = new ArrayList<>();

        for (int i = l; i<= r; i++) {
            String strNum = String.valueOf(i);
            if (strNum.matches("[05]+")) {
                resultList.add(i);
            }
        }

        // 결과가 비어있으면 -1 반환
        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        // 리스트를 int[]로 변환하여 반환
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}