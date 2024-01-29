class Solution {
   
    // arr[queries[i][0]] 번째와 arr[queries[i][1]] 사이 값 중
    // queries[i][2] 보다 크지만 가장 작은 값// 이 없다면 -1 리턴
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer=new int[queries.length];

        for(int i = 0;i<queries.length;i++){
            int pickNum = -1;
            for(int j =queries[i][0] ;j<=queries[i][1];j++){
                // System.out.println(j+"번째 검사 =>" +arr[j]);
                if(arr[j]>queries[i][2]){
                    if(pickNum == -1){
                        pickNum=arr[j];
                    } else if(arr[j]<pickNum){
                        pickNum=arr[j];
                    }
                }
            }
            answer[i] = pickNum;

        }


        return answer;
    }

}