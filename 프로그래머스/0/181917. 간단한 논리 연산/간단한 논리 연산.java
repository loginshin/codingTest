class Solution {
     public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x12 = false;
        boolean x34 = false;

        if(x1 || x2){
            x12 = true;
        }

        if(x3 || x4){
            x34 = true;
        }

        //1개라도 false라면 false
        if(x34  && x12){
            return answer;
        }else{
            return answer = false;
        }
    }
    
}