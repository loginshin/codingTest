function solution(players, callings) {
  let playerPositions = new Map(); // 선수의 이름과 위치를 매핑할 해시맵

  // 초기 선수의 위치를 설정
  for (let i = 0; i < players.length; i++) {
    playerPositions.set(players[i], i);
  }

  for (let call of callings) {
    // 호출된 선수의 현재 위치를 가져옴
    let currentPosition = playerPositions.get(call);

    if (currentPosition > 0) {
      // 현재 위치가 0이 아니면 앞의 선수와 자리를 바꿈
      let previousPlayer = players[currentPosition - 1];

      // 선수 자리 변경
      players[currentPosition - 1] = call;
      players[currentPosition] = previousPlayer;

      // 해시맵 업데이트
      playerPositions.set(call, currentPosition - 1);
      playerPositions.set(previousPlayer, currentPosition);
    }
  }

  return players;
}



// 시간 초과 ↓↓↓↓↓↓↓
// function solution(players, callings) {
//   let answer = [];
//     let tmp = '';

//     callings.map( function(call) {
//         for (let i = 0; i < players.length; i++) {
//             if (call === players[i]) {
//                 tmp = players[i - 1];
//                 players[i - 1] = players[i];
//                 players[i] = tmp;
//             }
//         }
//         answer = players;
//     });

//     return answer;
// }