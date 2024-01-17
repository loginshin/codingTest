class Solution {
  public int solution(int[] num_list) {
//         int answer = 0;
//         int one=1;
//         int two=0;

//         //list의 곱이 합의 제곱보다 작으면 1 아니면 0 return
//         for(int i = 0 ;i <num_list.length ; i++){
//             two+=num_list[i];
//             one = one * num_list[i];
//         }
//         two = two*two;
//         System.out.println("one = "+ one+ " /// tow = " + two);

//         if(one <two){
//             return 1;
//         }else{

//             return 0;
//         }


       StringBuilder oddStringBuilder = new StringBuilder();
        StringBuilder evenStringBuilder = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStringBuilder.append(num);
            } else {
                oddStringBuilder.append(num);
            }
        }

        int oddSum = Integer.parseInt(oddStringBuilder.toString());
        int evenSum = Integer.parseInt(evenStringBuilder.toString());

        return oddSum + evenSum;
      
    }
}