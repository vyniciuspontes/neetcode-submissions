class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {

        val remaining = intArrayOf(0, 0)

        students.forEach { student ->
            run {
                if (student == 0) {
                    remaining[0]++
                } else {
                    remaining[1]++
                }
            }
        }

        for (sandwich in sandwiches) {

            if(sandwich == 0) {

                if(remaining[0] == 0) {
                    return remaining[1]
                }

                remaining[0]--
            }

            if(sandwich == 1) {
                if(remaining[1] == 0) {
                    return remaining[0]
                }

                remaining[1]--
            }
        }


        return 0
    }
}
