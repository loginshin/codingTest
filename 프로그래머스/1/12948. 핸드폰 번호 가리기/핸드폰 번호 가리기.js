function solution(phone_number) {
    let answer = '';

    const pnArr = Array.from(phone_number);
    answer = pnArr.fill('*', 0, pnArr.length - 4);

    return answer.join('');
}