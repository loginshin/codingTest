function solution(strArr) {
    let answer = [];

    for ( let i = 0; i < strArr.length; i++) {
        let charTmp = strArr[i].split('');
        let chkBool = true;
        console.log(charTmp, '를 검사합니다.');
        for (let l = 0; l < charTmp.length; l++) {

            console.log(charTmp[l], ' ... ');

            if (charTmp[l] === 'a') {
                if ((l + 1) !== charTmp.length && charTmp[l + 1] === 'd') {
                    console.log('a,d가 연속됩니다');
                    chkBool = false;
                    break;
                }
            } else {
                continue;
            }
        }
        if (chkBool) {
            answer.push(strArr[i]);
        }
    }
    return answer;
}