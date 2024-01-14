class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int tmp =0;

        for(int i = 0; i < included.length; i ++){
            if(i==0){
                tmp = a;
            }else{
                tmp = tmp + d;
            }

            if(included[i]){
                answer = answer +tmp;
            }

        }
        return answer;
    }
}