
import java.util.Arrays;


class Solution{
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0; //마지막 공격 이후 캐릭터의 체력
        int limitTime = attacks[attacks.length -1][0]; // 최대 시간 (시간 제한)

        int successCount = 0; //연속 성공 count == limitSuccess가 된다면 bandage [2]만큼 hp+++++++
        int limitSuccess = bandage[0]; // 추가힐 발동 조건
        int hp = health; //주인공 최력    health = maxHP

        // 공격받는 타이밍을 체크 -1이라면 공격 타이밍아 아니다 // 공격 타이밍이라면 데미지를 배열에 넣는다.
        int[] attackPatternArray = new int[limitTime +1];
        Arrays.fill(attackPatternArray, -1); // default = -1;

        //attack 타이밍을 전부 가져와서 attackBooleanArray에 적용
        for (int[] attack : attacks) {
            int attackTime = attack[0];
            attackPatternArray[attackTime] = attack[1];
        }

        int checkCount=0;
        // 공격 타이밍 출력
        for (int b : attackPatternArray ) {
            System.out.println(checkCount +"time 공격 타이밍 " + b);
            checkCount++;
        }




        /* 0초 부터 적의 마지막 공격까지 시간 흐름
        *       상황***
        *       1. 힐 성공 ( 공격을 받지 않았다면 )
        *           1. 연속성공++
        *           2. 최대 연속 성공시 최대 체력만큼 추가회복
        *           3. 초당 힐량 만큼 힐량
        *       2. 공격 받는 상황 (if문으로 잡아서 continue로 끝까지 못가게한다.)
        *           1. hp가 0이되면 -1 return
        *           2. 연속 성공 = 0
        *           3. 체력을 깍는다.
        * */

        for( int time = 0 ; time<=limitTime ; time++){

            System.out.println("\n\n======\n\n"+time + "초 입니다.");


            //                      ===========================         공격 패턴               ==================
            System.out.println("공격 타이밍인가? 데미지는 ? (-1 : skip) "+attackPatternArray[time]);
            if(attackPatternArray[time] != -1){
                hp-=attackPatternArray[time];
                System.out.println("캐릭터가 맞았습니다. 남은 체력" + hp);
                successCount=0;
                //죽었는지 체크
                if(hp<=0){
                    System.out.println("캐릭터가 죽었습니다");
                    return hp =-1;
                }



            }else { //                      ============================= attack타이밍이 아니라면 heal ======================================
                // 1.3. 초당 힐량 만큼 힐 (최대 체력보다 낮을 경우(최대 체력 만큼만 회복))
                System.out.println("힐타이밍입니다."+bandage[1]+"만큼 회복했습니다.");
                hp+=bandage[1];
                successCount++;

                if(successCount ==limitSuccess){
                    System.out.println("연속 성공 => 추가 heal");
                    hp+=bandage[2];
                    successCount=0;
                }
                //최대 체력보다 많을시 최대체력으로 조정
                if (health<hp){
                    System.out.println("최대 체력입니다");
                    hp = health;

                }


            }

            System.out.println("현재 hp =" + hp);
        }
        // 모든 공격 패턴이 끝난 후 ..........................
        return hp;
    }
}