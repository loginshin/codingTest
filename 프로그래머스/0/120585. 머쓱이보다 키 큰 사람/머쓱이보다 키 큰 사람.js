function solution(array, height) {
    let answer = 0;
    array.map((arr) => height < arr && answer++);
    return answer;
}