function solution(array, height) {
       let answer = 0;

    array.map(function(value) {
        if ( value > height ) {
            answer++;
        }
    });
    return answer;
}