

// console.log("hello start codingtest");
// var cards1 = ["i", "drink", "water"];
// var cards2 = ["want", "to"];
// var goal = ["i", "want", "to", "drink", "water"];


// var result = solution(cards1, cards2, goal);
// console.log(result);


var cards1 = ["i", "water", "drink"];
var cards2 = ["want", "to"];
var goal = ["i", "want", "to", "drink", "water"];

var result = solution(cards1, cards2, goal);
console.log(result);


// 제출 함수

/*
    solution
        goal에 있는 배열들을 하나씩 검사해서 cards1, cards2 각 배열에 일치하는 카드가 있는지 검사한다.
        만약 카드를 사용한다면 빼줘야한다.
        모두 완성하면 "Yes" 완성하지 못하면"No"를 리턴해준다.
        조건) 순서대로 사용돼야한다. => cards1Count를 사용해서 배열중 뒤에껄 사용했을때 카운터보다 낮은숫자를 고르지 못하게한다.
        +) 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다. 즉 앞에 카드만 사용할 수 있다.
        */
function solution(cards1, cards2, goal) {
    var answer = '';
    var cards1Count=0;
    var cards2Count=0;


    for(var i = 0 ; i < goal.length; i++){
        console.log(goal.length," 개 중 " , (i+1) ,"번째 검사 합니다. 찾을 문자는", goal[i] )

        if(cards1[0] === goal[i]){
            console.log("cards1에 카드가 존재합니다.")
            //forEach문 + includes() 사용
            cards1.splice(0, 1); // 카드제거
            console.log("cards1 에 남은 카드",cards1);
            continue
        }else if(cards2.includes(goal[i])){
            console.log("cards2에 카드가 존재합니다.")
            //forEach문 + includes() 사용
            cards2.splice(0, 1); // 카드제거
            console.log("cards2 에 남은 카드",cards2);
            continue;
        }else{
            return "No"
        }
        console.log("\n\n")
    }
    return "Yes";
}