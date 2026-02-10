class Solution {
      fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var result : Int = 0

        val dice : List<Int> = listOf(a, b, c, d)
        var diceCountMap = dice.groupingBy { it }.eachCount()

        when(diceCountMap.size) {
            1 -> { // 4개 동일
                val p = diceCountMap.keys.first()
                result = p * 1111
            } 2 -> { // 3+1 or 2+2
                val values = diceCountMap.values.toList()
                if (values.contains(3)) { // 3+1
                    val p = diceCountMap.filterValues { it == 3 }.keys.first()
                    val q = diceCountMap.filterValues { it == 1 }.keys.first()
                    result = (10 * p + q) * (10 * p + q)
                } else { // 2+2
                    val nums = diceCountMap.keys.toList()
                    result = (nums[0] + nums[1]) * kotlin.math.abs(nums[0] - nums[1])
                }
            } 3 -> { //2+1+1
                val qAndR = diceCountMap.filterValues { it == 1 }.keys.toList()
                result = qAndR[0] * qAndR[1]
            } else -> { // 전부 다름
                result = dice.minOrNull()!!
            }
        }

        return result
    }
}