class Solution {
   public int solution(int n) {
        int answer = 0;

        if(n%2 ==0){
            int num=0;
            for(int i = 0; i <=n;i++){
                num = num+(i*i);
                i++;
            }
            answer=num;
        }else{
            int num=0;
            for(int i = 0; i <=n;i++) {
                i++;
                num = num + i;

            }
            answer = num;
        }


        return answer;
    }
}