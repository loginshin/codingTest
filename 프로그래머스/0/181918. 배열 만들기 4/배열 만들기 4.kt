class Solution {
    fun solution(arr: IntArray): IntArray {
        val stack = IntArray(arr.size)
        var top = 0
        var i = 0

        while (i < arr.size) {
            if (top == 0) {
                stack[top++] = arr[i]
                i++
            } else {
                val last = stack[top - 1]
                if (last < arr[i]) {
                    stack[top++] = arr[i]
                    i++
                } else {
                    top--
                }
            }
        }

        return stack.copyOfRange(0, top)
    }
}
