class Solution {
    fun solution(new_id: String): String {
  // 문자열 모든 문자 소문자로 치환
    // 알파벳 소문자, 숫자, 하이픈, 언더바,마침표를 제외한 모든 문자 제거
    var tmp = new_id.lowercase()
        .replace(Regex("[^a-z0-9._-]"), "")

    // 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
    while (".." in tmp) {
        tmp = tmp.replace("..", ".")
    }

    // 마침표가 처음이나 끝에 위치한다면 제거
    tmp = tmp.trim('.')

    // 빈 문자열이라면, string에 "a" 대입 (길이 똑같이)
    if (tmp.isEmpty()) tmp = "a"

    // 길이가 16자 이상이면, string의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
    // 만약 제거 후 마침표가 string의 끝에 위치한다면 끝에 위치한 마침표 문자를 제거
    if (tmp.length >= 16) {
        tmp = tmp.substring(0, 15)
        tmp = tmp.trimEnd('.')
    }

    // 길이가 2자 이하라면, string의 마지막 문자를 string의 길이가 3이 될 때까지 반복해서 끝에 붙인다.
    while (tmp.length < 3) {
        tmp += tmp.last()
    }

    return tmp
    }
}