
class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0

        // p의 자릿수 추출
        val splitSize: Int = getSizeString(p)

        // String의 Char List 추출
        val stringList: ArrayList<String> = getCharListOfString(t, splitSize)

        // 값 비교
        answer = compareString(stringList, p)

        return answer
    }

    /**
     * String 자릿수 추출
     */
    fun getSizeString(targetString: String): Int = targetString.length

    /**
     * 값 분리후 비교 전용 List 생성
     */
    fun getCharListOfString(targetString: String, splitSize: Int): ArrayList<String> {
        val targetCharList: List<Char> = targetString.toList()
        var combineStringTmp: String = ""
        var compareList = ArrayList<String>()

        for (i in 0 until targetString.length) {
            // i부터 splitSize 만큼 없다면 멈추기
            if (i+ splitSize > targetCharList.size) return compareList

            for (j in i until splitSize + i) {
                combineStringTmp += targetString[j]
            }
            compareList.add(combineStringTmp)
            combineStringTmp = ""
        }
        
        return compareList
    }

    /**
     * 두 값 비교
     */
    fun compareString(strList: ArrayList<String>, targetString: String): Int {
        var count: Int = 0

        for (i in 0 until strList.size) {
            if (strList.get(i) <= targetString ) count++
        }

        return count
    }

}