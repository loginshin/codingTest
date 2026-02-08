class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val reportSet = report.toSet()
        val reportedCount = mutableMapOf<String, Int>()
        val reportMap = mutableMapOf<String, MutableSet<String>>()

        for (r in reportSet) {
        val (from, to) = r.split(" ", limit = 2)

            reportMap.computeIfAbsent(from) { mutableSetOf() }.add(to)
            reportedCount[to] = reportedCount.getOrDefault(to, 0) + 1
        }

        val bannedUsers = reportedCount
            .filter { it.value >= k }
            .keys

        val result = IntArray(id_list.size)

        for ((index, user) in id_list.withIndex()) {
            val reportedUsers = reportMap[user] ?: emptySet()
            result[index] = reportedUsers.count { it in bannedUsers }
        }
        
    return result

    }
}