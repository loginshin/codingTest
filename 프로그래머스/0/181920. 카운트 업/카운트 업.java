import java.util.ArrayList;
import java.util.List;

class Solution {
     public int[] solution(int start_num, int end_num) {
            List<Integer> listAnswer = new ArrayList();

            // 리스트에 count값 순서데로 집어넣기
            for(int i=start_num;i<=(end_num); i++){
//                System.out.println(i);
                listAnswer.add(i);
            }

            // 리스트 사이즈 크기 배열 만들고(배열의 크기는 고정값이기 때문)
            // 배열에 리스트 값 순서데로 집어넣기
            int listSize = listAnswer.size();

            int[] answer = new int[listSize];
            for(int j =0; j<listSize; j++){
                answer[j] = (int) listAnswer.get(j);
            }


            return answer;
        }
}