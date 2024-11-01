function solution(myString, pat) {
    let answer = 0;
    let myStringCharArr = myString.split('');
    let patCharArr = pat.split('');
    let chkCount = 0;

    for (let i = 0; i < myStringCharArr.length; i++) {
        if (myStringCharArr[i] === patCharArr[chkCount]) {
            for (let l = 0; l < pat.length; l++) {
                if (patCharArr[l] === myStringCharArr[i + l] ) {
                    chkCount++;
                }
            }
            if (chkCount === pat.length) {
                answer++;
            }
        }
        chkCount = 0;
    }

    return answer;
}