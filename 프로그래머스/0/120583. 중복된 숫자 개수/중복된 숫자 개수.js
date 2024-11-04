function solution(array, n) {
   let answer = 0;

    const arrayMap = array.map( function(value, index, array) {
        if ( value === n ) {
            answer++;
        }
    });

    return answer;
}