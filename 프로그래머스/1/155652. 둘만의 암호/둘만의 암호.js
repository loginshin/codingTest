function solution(s, skip, index) {
    const skipSet = new Set(skip); // skip에 포함된 문자들을 Set으로 저장
    const aCode = 'a'.charCodeAt(0); // 'a'의 ASCII 값
    const zCode = 'z'.charCodeAt(0); // 'z'의 ASCII 값
    
    let result = '';

    for (let char of s) {
        let currentCharCode = char.charCodeAt(0);
        let steps = index;

        while (steps > 0) {
            currentCharCode++; // 다음 문자로 이동
            if (currentCharCode > zCode) {
                currentCharCode = aCode; // z를 넘어가면 a로 돌아감
            }
            if (!skipSet.has(String.fromCharCode(currentCharCode))) {
                steps--; // skip에 포함되지 않은 경우에만 카운트 감소
            }
        }

        result += String.fromCharCode(currentCharCode); // 결과 문자열에 추가
    }

    return result;
}
