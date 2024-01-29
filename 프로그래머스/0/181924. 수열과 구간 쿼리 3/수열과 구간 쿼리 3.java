class Solution {
       // 배열 arr의 순서를 queries 배열의 index값 순서대로 i,j 위치를 바꿔 리턴
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int tmp; // 숫자 교체용


        for(int i=0;i<queries.length;i++){
           tmp = arr[queries[i][0]];
           arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        answer = arr;

        return answer;
    }
}