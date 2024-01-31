import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length]; // 사진 갯수

        // 1차원 배열 지정  후  2차원 배열 크기에 맞게 적용 => 사진들의 점수가 들어갈 공간 만들기
        int[][] answerTemp = new int[photo.length][];
        for (int s = 0; s < photo.length; s++) {
            answerTemp[s] = new int[photo[s].length]; // 각 행의 배열 길이 설정
        }


        //사진 갯수만큼 for문 돌린다.
        for(int i =0;i< photo.length;i++){
            System.out.println("\n\n======="+i+"번째 사진 검사========");
            //사진에 이름들을 검사
            for(int j = 0; j<photo[i].length;j++){
                String nameInPhoto = photo[i][j];
                //특정 이름의 순서 알아낸다음 , 점수 알아내기 => 이름 String type 숫자로 바꿔 배열에 넣기
                for(int k=0;k<name.length;k++){
                    if(nameInPhoto.equals(name[k])){
                        photo[i][j]=yearning[k]+"";
                    }
                }
                // 숫자가 아니라면 "0"으로 바꾸기
                for(int ks=0;ks<name.length;ks++){
                    if(photo[i][j].matches("[a-zA-Z]+")){
                        photo[i][j]="0";
                    }
                }

            }
            //콘솔 확인 ///////////////// int로 바꾸기
            System.out.println(i+"번째 사진 점수는");
            for (int h = 0;h< photo[i].length;h++){
                System.out.println(photo[i][h]);

                answerTemp[i][h]= Integer.parseInt(photo[i][h]);
            }

            //점수 합치기
            answer[i] = Arrays.stream(answerTemp[i]).sum();
        }


        return answer;
    }
}
