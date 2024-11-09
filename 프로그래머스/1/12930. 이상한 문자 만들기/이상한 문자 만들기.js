function solution(s) {
    let answer = '';

    // 틀린 로직
    // let sArray = Array.from(s);
    // sArray.map( (charData, index) => {
    //     index % 2 === 0 ? sArray[index] = charData.toUpperCase() : sArray[index] = charData.toLowerCase();
    // });
    // answer = sArray.join('');

    let sArray = Array.from(s);
    sArray.forEach( (charData, index) => {

        console.log('검사하는문자는 === ', charData);

        if (index === 0) {
            sArray[index] = charData.toUpperCase();
            return;
        }

        if (sArray[index - 1] === ' ') {
            sArray[index] = charData.toUpperCase();
        } else {
            let upperTmp = sArray[index - 1].toUpperCase();

            if (sArray[index - 1] === upperTmp) { // 대문자라면 소문자로
                sArray[index] = charData.toLowerCase();
            } else { // 소문자라면 대문자로
                sArray[index] = charData.toUpperCase();
            }
        }
    });
    answer = sArray.join('');

    return answer;
}